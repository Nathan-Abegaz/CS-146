

	import java.util.HashSet;
	import java.util.LinkedList;
	import java.util.List;
import java.util.Scanner;
import java.util.Set;

	public class Spider
	{
	  public static final int MAX_PAGES_TO_SEARCH = 15;
	  public Set<String> pagesVisited = new HashSet<String>();
	  public List<String> pagesToVisit = new LinkedList<String>();


	  /**
	   * Our main launching point for the Spider's functionality. Internally it creates spider legs
	   * that make an HTTP request and parse the response (the web page).
	   * 
	   * @param url
	   *            - The starting point of the spider
	   * @param searchWord
	   *            - The word or string that you are searching for
	   */
	  public void search(String url, String searchWord)
	  {
	      while(this.pagesVisited.size() < MAX_PAGES_TO_SEARCH)
	      {
	          String currentUrl;
	          SpiderLeg leg = new SpiderLeg();
	          if(this.pagesToVisit.isEmpty())
	          {
	              currentUrl = url;
	              this.pagesVisited.add(url);
	          }
	          else
	          {
	              currentUrl = this.nextUrl();
	          }
	          leg.crawl(currentUrl); // Lots of stuff happening here. Look at the crawl method in
	                                 // SpiderLeg
	          boolean success = leg.searchForWord(searchWord);
	          if(success)
	          {
	              break;
	          }
	          this.pagesToVisit.addAll(leg.getLinks());
	      }
	  }


	  /**
	   * Returns the next URL to visit (in the order that they were found). We also do a check to make
	   * sure this method doesn't return a URL that has already been visited.
	   * 
	   * @return
	   */
	  private String nextUrl()
	  {
	      String nextUrl;
	      do
	      {
	          nextUrl = this.pagesToVisit.remove(0);
	      } while(this.pagesVisited.contains(nextUrl));
	      this.pagesVisited.add(nextUrl);
	      return nextUrl;
	  }
	  
	  public Website[] toArray(Set<String> pagesVisited)
	  {
		  Website [] arr = new Website[30];
		  for (int i = 0; i < 30; i++)
		  {
			  int frequency = (int)(Math.random() * 50 + 1);
			  int age = (int)(Math.random() * 50 + 1);
			  int connections = (int)(Math.random() * 50 + 1);
			  int subscription = (int)(Math.random() * 50 + 1);
			  int totalScore = frequency + age + connections + subscription;
			  int pageRank = totalScore/4;
			  int index = i; //  change
			  Website n = new Website(i,frequency,age,connections,subscription, totalScore, pageRank, this.pagesToVisit.get(i));
			  arr[i] = n;
		  }
		  return arr;
	  }
	  
	  public void setPageRank(Website[] temp)
	  {
	        for(int i = 0; i < temp.length; i++)
	        {
	        	int j = i + 1;
	        	temp[i].setPageRank(j);
	        }
	  }
	  
	  public static boolean check()
	    {
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Would you like to change another scope? ");
			String response = scan.nextLine();
			return  response.equals("yes");
	    }
	  public static boolean checks()
	    {
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Would you like to search another word? ");
			String response = scan.nextLine();
			return  response.equals("yes");
	    }
	 	  
	  
}

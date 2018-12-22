import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawlerTester
{
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args
     *            - not used
     */
	public static void main(String[] args)
	{
		Spider spider = new Spider();
		Scanner scan = new Scanner(System.in);

		System.out.print("Input word to search: ");
		String word = scan.nextLine();
		int num = 0;
		spider.search("https://www.wikipedia.org", word);

		Website[] temp = spider.toArray(spider.pagesVisited);
		Website.heapSort(temp);
		spider.setPageRank(temp);
		System.out.println("Index   TotalScore  PageRank   URL");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(" " + temp[i].getIndex() + "           " + temp[i].getTotalScore() + "     "
					+ temp[i].getPageRank() + "        " + temp[i].getUrl());

		}
	}
	
}

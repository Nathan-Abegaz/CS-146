import java.util.Scanner;

public class Driver {
	
	public static void main(String[]args)
    {
    	Spider spider = new Spider();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input word to search: ");
		String word = scan.nextLine();
		spider.search("https://www.wikipedia.org", word);
        Website[] temp = spider.toArray(spider.pagesVisited);

        Node x = new Node(temp[0].getPageRank(),temp[0].getUrl());
	        RBTree rb = new RBTree(x);
	        for(int i = 1; i < temp.length; i++)
	        {
	        	Node n = new Node(temp[i].getTotalScore(), temp[i].getUrl());
	        	rb.insert(rb,n);
	        }
	        rb.inorderTreeWalk(rb.root);
	        
	        System.out.println("");

	        System.out.print("Would you like to delete? PLease select 'yes' or 'no'    ");
			 word = scan.nextLine();
			 if(word.equals("yes"))
			 {
				 rb.delete(rb, x);
			    rb.inorderTreeWalk(rb.root);
			 }
			 else
			 {
				 System.out.println("       Program Finished");
			 }

    }

}

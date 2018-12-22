import java.util.Scanner;
/*
 * The main purpose of this class is to create a binary search tree from the url links.
 * The program would compare the total score from each link and insert them into the binary search tree
 */
public class BinarySearchTree {
	
	private Node root;



    public BinarySearchTree(Node root) {

        this.root = root;
    }

  
    public void insert(Node x) {
    	int i = 1;
        Node y = null;
        Node z = root;

        while (z != null) {

            y = z;

            if (x.getWeb().getTotalScore() <= z.getWeb().getTotalScore()) {

                z = z.getLeftChild();
            } else {

                z = z.getRightChild();
            }
        }

        x.setParent(y);

        if (root == null)
        {
            root = x;
        }
        else if (x.getWeb().getTotalScore() <= y.getWeb().getTotalScore())
        {

            y.setLeftChild(x);
        }
        else
        {

            y.setRightChild(x);
        }
    }


    public Node searches(Node x, int key) {

        while (x != null && key != x.getWeb().getPageRank()) {

            if (key < x.getWeb().getPageRank()) {
                x = x.getLeftChild();
            } else {
                x = x.getRightChild();
            }
        }
        return x;
    }

    public void search(Node x, int key) {

        while (x != null && key != x.getWeb().getPageRank()) {
        	
            if (key < x.getWeb().getPageRank()) {
                x = x.getLeftChild();
            } else {
                x = x.getRightChild();
            }
        }
       System.out.println(x.getWeb().getUrl() + " Total Score: " + x.getWeb().getTotalScore() + " Page Rank Score: " + x.getWeb().getPageRank());
    }
    
    public void transplant(Node u, Node v)
    {
    	if(u.getParent() == null)
    	{
    		root = v;
    	}
    	
    	else if(u.getParent().getLeftChild() == u)
    	{
    		u.getParent().setLeftChild(v);
    	}
    	else
    	{
    		u.getParent().setRightChild(v);
    	}
    	
    	if (v != null)
    	{
    		v.setParent(u.getParent());
    	}
    }
    public Node treeMinimum(Node x)
    {
    	while(x.getLeftChild() != null)
    	{
    		x = x.getLeftChild();
    	}
    	return x;
    }
    public void delete(int pageRank)
    {
    	Node z = searches(root, pageRank);
    	
    	if(z.getLeftChild() == null)
    	{
    		transplant(z,z.getRightChild());
    	}
    	else if(z.getRightChild() == null)
    	{
    		transplant(z,z.getRightChild());
    	}
    	else
    	{
    		Node y = treeMinimum(z);
    		if(y.getParent() != z){
    			transplant(y,y.getRightChild());
    			y.setRightChild(z.getRightChild());
    			y.getRightChild().setParent(y);
    		}
    		transplant(z,y);
    		y.setLeftChild(z.getLeftChild());
    		y.getLeftChild().setParent(y);
    		}
    	}
    public void inOrderWalk(Node root)
    {
    	if(root != null)
    	{
    		inOrderWalk(root.getLeftChild());
    		System.out.println("Index: " + root.getWeb().getIndex() + " Total Score: " + root.getWeb().getTotalScore() +
    						   " PageRank: " + root.getWeb().getPageRank() + " URL: " + root.getWeb().getUrl());
    		inOrderWalk(root.getRightChild());
    	}
    }
    
    public void index(Node root)
    {
    	int i = 1;
    	if(root != null)
    	{
    		inOrderWalk(root.getLeftChild());
    		this.root.getWeb().setPageRank(i);
    		i++;
    		inOrderWalk(root.getRightChild());
    	}
    }
    
    public static void main(String[]args)
    {
    	Spider spider = new Spider();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input word to search: ");
		String word = scan.nextLine();
		spider.search("https://www.wikipedia.org", word);
        Website[] temp = spider.toArray(spider.pagesVisited);

        BinarySearchTree bst = new BinarySearchTree(new Node(temp[0].getPageRank(),temp[0]));
        for(int i = 0; i < temp.length; i++)
        {
        	Node n = new Node(temp[1].getPageRank(),temp[i]);
        	temp[i].setIndex(i);
        	bst.insert(n);
        }
        bst.index(bst.root);
        bst.inOrderWalk(bst.root);
        System.out.println();
        bst.search(bst.root, 1);
        

    }

}

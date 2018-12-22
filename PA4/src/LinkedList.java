
/*
 * This program will simulate the interaction of facebook with the user by 
 */
public class LinkedList {
	
	private final static int TABLE_SIZE = 128;
	public Node root; 
	// Implements Node class that will be used when store each hash value

	public LinkedList()
	{
		root = null;
	}
	
	public void add(Node root, Node n)
	{
		while(root.next != null)
		{
			root = root.next;
		}
		root.next = n;
	}	
	
	
	
	
}


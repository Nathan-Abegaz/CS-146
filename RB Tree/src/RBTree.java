
/*
 * This class creates the Red Black Tree class which simulates a self balancing binary search tree. 
 * Utilizes stores the websites into the the node class, which is later then organized by a red black tree
 * 
 */
public class RBTree {

	public Node nil ;
	public Node root;
	String RED = "red";
	String BLACK = "black";

	public RBTree(Node startingRoot)

	{
		root = startingRoot;
		nil = startingRoot;
	}
	public void leftRotate(RBTree T, Node x) {
		Node y = x.right;
		x.right = y.left;
		if (y.left != T.nil) {
			y.left.parent = x;
		}
		y.parent = x.parent;
		if (x.parent == T.nil) {
			T.root = y;
		} else if (x == x.parent.left) {
			x.parent.left = y;
		} else {
			x.parent.right = y;
		}
		y.left = x;
		x.parent = y;

	}

	public void rightRotate(RBTree T, Node x) {
		Node y = x.left;
	    x.left = y.right;
	    if (y.right != T.nil)
	        y.right.parent = x;
	    y.parent = x.parent;
	    if (x.parent == T.nil)
	        T.root = y;
	    else if (x == x.parent.right)
	        x.parent.right = y;
	    else
	        x.parent.left = y;
	    y.right = x;
	    x.parent = y;
	}

	public void insert(RBTree T, Node z) {
		Node y = T.nil;
	    Node x = T.root;
	    while (x != T.nil) {
	        y = x;
	        if (z.key < x.key)
	            x = x.left;
	        else
	            x = x.right;
	    }
	    z.parent = y;
	    if (y == T.nil)
	        T.root = z;
	    else if (z.key < y.key)
	        y.left = z;
	    else
	        y.right = z;
	    z.left = T.nil;
	    z.right = T.nil;
	    z.color = RED;
	    insertFixup(T, z);
	}

	public void insertFixup(RBTree T, Node z) {
		   while (z.parent.color == RED) {
		        if (z.parent == z.parent.parent.left) {
		            Node y = z.parent.parent.right;
		            if (y.color == RED) {
		                z.parent.color = BLACK;
		                y.color = BLACK;
		                z.parent.parent.color = RED;
		                z = z.parent.parent;
		            } else {
		                if (z == z.parent.right) {
		                    z = z.parent;
		                    leftRotate(T, z);
		                }
		                z.parent.color = BLACK;
		                z.parent.parent.color = RED;
		                rightRotate(T, z.parent.parent);
		            }
		        } else {
		            Node y = z.parent.parent.left;
		            if (y.color == RED) {
		                z.parent.color = BLACK;
		                y.color = BLACK;
		                z.parent.parent.color = RED;
		                z = z.parent.parent;
		            } else {
		                if (z == z.parent.left) {

		                    z = z.parent;
		                    rightRotate(T, z);
		                }
		                z.parent.color = BLACK;
		                z.parent.parent.color = RED;
		                leftRotate(T, z.parent.parent);
		            }
		        }

		        
		    }
		    T.root.color = BLACK;
	}

	public void inorderTreeWalk(Node t) {
	    if (t != null) {
	    	inorderTreeWalk(t.left);
	        System.out.println("Total Score: " + t.key + " URL Name: " + t.url + " Color: " + t.color);
	        inorderTreeWalk(t.right);
	    }
	}
	
	public void transplant(RBTree T, Node u, Node v)
	{
		if (u.parent == T.nil)
		{
			T.root = v;
		}
		else if( u == u.parent.left)
		{
			u.parent.left = v;
		}
		else
		{
			u.parent.left = v;
		}
		v.parent = u.parent;
	}
	
	public void delete(RBTree T, Node z)
	{
		Node y = z;
		Node x;
		if(z.left == T.nil)
		{
			 x = z.left;
			z.
			transplant(T,z, z.right);
		}
		else if(z.right == T.nil)
		{
			x = z.left;
			transplant(T,z,z.left);
		}
		else
		{
			y = treeMinimum(z.right);
			x = y.right;
			if(y.parent == z)
			{
				x.parent = y;
			}
			else
			{
				transplant(T,y,y.right);
				y.right = z.right;
				y.right.parent = y;
			}
			transplant(T,z,y);
			{
				y.left = z.left;
				y.left.parent = y;
				y.color = z.color;
			}
			if(y.color.equals(BLACK));
			{
				deleteFixup(T,y);
			}
			
		}

	}
	public Node treeMinimum(Node x)
	{
		while (x.left!=null)
		{
			x = x.left;
			
		}
		return x;
	}
	public void deleteFixup(RBTree T, Node x)
	{
		while(x!= x.parent.left)
		{
			if(x.equals(x.parent.left))
			{
				Node w = x.parent.left;
				
				if(w.color.equals(RED))
				{
					w.color = BLACK;
					x.parent.color = RED;
					leftRotate(T,x.parent);
					w = x.parent.right;
				}
				if(w.left.color.equals(BLACK) && w.right.color.equals(BLACK))
				{
					w.color = RED;
					x = x.parent;
				}
				else if(w.right.color.equals(BLACK))
				{
					w.left.color = BLACK;
					w.color = RED;
					rightRotate(T,w);
					w = x.parent.right;
				}
				w.color = x.parent.color;
				x.parent.color = BLACK;
				w.right.color = BLACK;
				leftRotate(T,x.parent);
				x = T.root;
			}
			else
			{
				x.color = BLACK;
			}
		}
	}
}

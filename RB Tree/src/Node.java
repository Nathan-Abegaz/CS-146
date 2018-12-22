
/*
 * Node data structure that is used to create a binary search tree.
 */
public class Node{

    public Node left;
    public Node right;
    public Node parent;
    public int  key;
    String url;

    public String color;

	public Node(int totalScore, String url) {

       this.key = totalScore;
       this.url = url;
    }


	public Node getLeftChild() {
        return left;
    }

    public void setLeftChild(Node leftChild) {
        this.left = leftChild;
    }

    public Node getRightChild() {
        return right;
    }

    public void setRightChild(Node rightChild) {
        this.right = rightChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
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
	


}


	
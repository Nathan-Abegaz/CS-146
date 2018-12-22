
/*
 * Node data structure that is used to create a binary search tree.
 */
public class Node{

    private Node leftChild;
    private Node rightChild;
    private Node parent;
    private int  key;
    private Website web;

    public Website getWeb() {
		return web;
	}

	public void setWeb(Website web) {
		this.web = web;
	}

	public Node(int key, Website web) {

        this.key = key;
        this.web = web;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setKey(int key) {

        this.key = key;
    }

    public int getKey() {
        return key;
    }

}


	
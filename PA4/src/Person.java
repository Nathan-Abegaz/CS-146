
public class Person {
	
	private String name;
	private LinkedList list;
	public Node[] hashList  = new Node[788];
	private Person next = null;

	
	public Person(String name, LinkedList list)
	{
		this.name = name;
		this.list = list;
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList getList() {
		return list;
	}

	public void setList(LinkedList list) {
		this.list = list;
	}
	public void add(Node root, Node n)
	{
		while(root.next != null)
		{
			root = root.next;
		}
		root.next = n;
	}
	public void addFriend(String name)
	{
		Node newFriend = new Node(name);
		//Empty List
		Node head  = list.root;
		if(list.root == null)
		{
			list.root = newFriend;
		}
		else
		{
			Node temp = list.root;
			list.add(temp, newFriend);
		}
		
	}
	
	public int hash(String name)
	{
		
		return 0;
	}
	

}

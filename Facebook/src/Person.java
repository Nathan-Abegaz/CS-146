/*
 * Creates Person class that would implement a mini Facebook through the use of hashing specifically, hashing open chaining with hash tables.
 * The hash values for each person would be calculated by taking the ascii value for each person names and divided by the length of the given array[100].
 * The class would utilize the linked list class to connect two people with similar hash values and build a chaining operation to allow each program 
 * to iterate through each Person. By utilizing the hash function, the search operation is O(1), which is very efficient. 
 */
public class Person {

	private String name;
	private Person next;
	LinkedList[] table;

	public Person(String name, LinkedList list) {
		this.name = name;
		table = new LinkedList[100];
		for (int i = 0; i < table.length; i++) {
			table[i] = null;
		}
	}

	public String getName() {
		return name;
	}

	/*
	 * This simulates the adding new friend to account feature in facebook. It
	 * does this by calculating the hash value and storing it inside the owners
	 * hash table. The owner of the account is now friends with Person "p".
	 * 
	 * @param Person object to be connected with
	 */
	public void connect(Person p) {
		int key = p.convertToAscii(p.name);
		int hash = (key % 100);
		if (table[hash] == null) {
			table[hash] = new LinkedList(p);
		} else {
			LinkedList entry = table[hash];
			while (entry.getNext() != null && entry.getKey() != hash) {
				entry = entry.getNext();
			}

			entry.setNext(new LinkedList(p));

		}
	}

	/*
	 * This method takes in the name of the desired contact to be removed from
	 * the person's friend list Searches through hash value based on the strings
	 * ascii value
	 * 
	 * @param name of the person to disconnect with
	 */
	public void disconnect(String name) {
		int hash = convertToAscii(name) % 100;
		if (table[hash] != null) {
			LinkedList prev = null;
			LinkedList temp = table[hash];
			if (temp.getP().name.equals(name)) {
				prev = null;

			} else {
				while (temp.getNext() != null && convertToAscii(temp.getP().name) != hash) {
					prev = temp;
					temp = temp.getNext();
				}
			}
			if (temp.getP().name.equals(name)) {
				if (prev == null) {
					table[hash] = temp.getNext();
				}
			} else {
				prev.setNext(temp.getNext());
			}
		}
	}

	/*
	 * Helper method created to convert a string to ascii number
	 * 
	 * @param string of the desired name to be deleted
	 */
	public int convertToAscii(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += (int) s.charAt(i);
		}
		return sum;
	}

	/*
	 * Searches through Person's list of friends and searches through the name specific name to retrieve
	 * 
	 * @param name of the desired person to retrieve from list 
	 * @return Person that contains the name of desired name
	 */
	public String get(String name) {
		int key = convertToAscii(name);
		int hash = (key % 100);
		if (table[hash] == null) {
			return null;
		} else {
			LinkedList entry = table[hash];
			if (entry.getP().name.equals(name)) {
				return entry.getP().name;
			}
			while (entry.getNext() != null && entry.getKey() != key) {
				if (entry.getP().name.equals(name)) {

					return entry.getP().name;
				}
				entry = entry.getNext();
			}
			return null;
		}

	}

	/*
	 * Checks if two person objects are connected as friends 
	 * 
	 * @param Person 1 
	 * @param Person 2 
	 * @return T/F statement declaring whether the two are friends 
	 */
	public static void isFriends(Person p1, Person p2) {
		// p1.get(p2.name).equals(p1.name) && p2.get(p1.name).equals(p2.name)
		boolean friends = false;
		if (p1.get(p2.name) == (p2.name) && p2.get(p1.name)==(p1.name))
			friends = true;
		if(friends)
		{
			System.out.println(p1.name + " is friends with " + p2.name);
		}
		else
			System.out.println(p1.name + " is not friends with " + p2.name);
	}

	/*
	 * Prints a list of friends from the linkedLists
	 */
	public void printFriends() {
		System.out.print(this.name + "'s" + " FriendList: ");
		for (int i = 0; i < this.table.length; i++) {
			if (this.table[i] != null) {
				LinkedList entry = table[i];
				while (entry != null) {
					System.out.print(entry.getP().name + " ");
					entry = entry.getNext();
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Person p1 = null;
		Person p2 = null;
		Person p3 = null;
		Person p4 = null;
		Person p5 = null;
		Person p6 = null;
		Person p7 = null;
		Person p8 = null;
		Person p9 = null;
		Person p10 = null;
		Person p11 = null;
		Person p12 = null;
		Person p13 = null;
		Person p14 = null;
		Person p15 = null;
		Person p16 = null;
		Person p17 = null;
		Person p18 = null;
		Person p19 = null;
		Person p20 = null;
		Person p21 = null;
		Person p22 = null;
		Person p23 = null;
		Person p24 = null;
		Person p25 = null;
		Person p26 = null;
		Person p27 = null;
		Person p28 = null;
		Person p29 = null;
		Person p30 = null;

		p1 = new Person("Tom", new LinkedList(p1));
		p2 = new Person("Bob", new LinkedList(p2));
		p3 = new Person("Jenny", new LinkedList(p3));
		p4 = new Person("Dan", new LinkedList(p4));
		p5 = new Person("Lily", new LinkedList(p5));
		p6 = new Person("Anya", new LinkedList(p6));
		p7 = new Person("Ryan", new LinkedList(p7));
		p8 = new Person("Julian", new LinkedList(p8));
		p9 = new Person("Abraham", new LinkedList(p9));
		p10 = new Person("Jason", new LinkedList(p10));
		p11 = new Person("Jackson", new LinkedList(p11));
		p12 = new Person("Rose", new LinkedList(p12));
		p13 = new Person("Sam", new LinkedList(p12));
		p14 = new Person("Jake", new LinkedList(p14));
		p15 = new Person("Robin", new LinkedList(p15));
		p16 = new Person("Mary", new LinkedList(p16));
		p17 = new Person("Blake", new LinkedList(p17));
		p18 = new Person("Kiki", new LinkedList(p18));
		p19 = new Person("Drake", new LinkedList(p19));
		p20 = new Person("Peter", new LinkedList(p20));
		p21 = new Person("Tony", new LinkedList(p21));
		p22 = new Person("Thor", new LinkedList(p22));
		p23 = new Person("Tchalla", new LinkedList(p23));
		p24 = new Person("Shuri", new LinkedList(p24));
		p25 = new Person("Beyonce", new LinkedList(p25));
		p26 = new Person("Amy", new LinkedList(p26));
		p27 = new Person("Eva", new LinkedList(p27));
		p28 = new Person("Riyel", new LinkedList(p28));
		p29 = new Person("Riley", new LinkedList(p29));
		p30 = new Person("Lebron", new LinkedList(p30));

		
		//Owner Account for Tom Connects with all 30 users and prints out friends list
		p1.connect(p2);
		p1.connect(p3);
		p1.connect(p4);
		p1.connect(p5);
		p1.connect(p7);
		p1.connect(p8);
		p1.connect(p9);
		p1.connect(p10);
		p1.connect(p11);
		p1.connect(p12);
		p1.connect(p13);
		p1.connect(p14);
		p1.connect(p15);
		p1.connect(p16);
		p1.connect(p17);
		p1.connect(p18);
		p1.connect(p19);
		p1.connect(p20);
		p1.connect(p21);
		p1.connect(p22);
		p1.connect(p23);
		p1.connect(p24);
		p1.connect(p25);
		p1.connect(p26);
		p1.connect(p27);
		p1.connect(p28);
		p1.connect(p29);
		p1.connect(p30);

		/// Connecting P2 with other friends 
		p2.connect(p1);
		p2.connect(p3);
		p2.connect(p4);
		p5.connect(p7);
		
		//Printing from friend list and check if they are friends 
		System.out.println("Printing Friends:");
		p1.printFriends();
		p2.printFriends();
		isFriends(p1,p2);
		System.out.println();
		
		// Connecting P3 with other friends 
		p3.connect(p1);
		p19.connect(p18);
		p19.connect(p1);
		p18.connect(p19);
		
		
		
		//Disconnecting
		System.out.println("Disconnecting:");
		System.out.println("Before deleting Tom from Bob's friend List");
		p2.printFriends();
		System.out.println("After deleting Tom from Bob's friendList");
		p2.disconnect("Tom");
		p2.printFriends();
		isFriends(p1,p2);
		System.out.println();

		//Handling Collsions
		//Both Riyel and Riley have same ascii values
		System.out.println("Handling Collisions");
		System.out.println("Bob's friendlist before conecting with Riley and Riyel");
		p2.printFriends();
		System.out.println("Bob's friendlist after connecting with Riyel and Riley");
		p2.connect(p28);
		p2.connect(p29);
		p2.printFriends();
		
		
	}
}

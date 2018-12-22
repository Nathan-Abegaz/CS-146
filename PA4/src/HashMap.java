public class HashMap {
	
	private final static int TABLE_SIZE = 128;
	Node []table ;
	
	public HashMap() {

			table = new Node[TABLE_SIZE];

		for (int i = 0; i < TABLE_SIZE; i++)

			table[i] = null;

	}

	public LinkedList get(String name) {
		
		int hash = name.hashCode() % TABLE_SIZE;

		if (table[hash].getP().getName() == null)

			return null;

		else {

			Node entry = table[hash];

			while (entry.equals(null) && entry.getP().getName().equals(name))

				entry = entry.getNext();

			if (entry == null)

				return null;

			else

				return entry.getP().getList();

		}

	}

	public void put(Person p) {

		int hash = (p.getName().hashCode() % TABLE_SIZE);

		if (table[hash] == null)

			table[hash] = new Node(hash, p);

		else {

			Node entry = table[hash];

			while (entry.getNext() != null && entry.index != hash)

				entry = entry.getNext();

			if (entry.getKey() == key)

				entry.setValue(value);

			else

				entry.setNext(new LinkedHashEntry(key, value));

		}

	}

	public void remove(int key) {

		int hash = (key % TABLE_SIZE);

		if (table[hash] != null) {

			LinkedHashEntry prevEntry = null;

			LinkedHashEntry entry = table[hash];

			while (entry.getNext() != null && entry.getKey() != key) {

				prevEntry = entry;

				entry = entry.getNext();

			}

			if (entry.getKey() == key) {

				if (prevEntry == null)

					table[hash] = entry.getNext();

				else

					prevEntry.setNext(entry.getNext());

			}

		}

	}

}
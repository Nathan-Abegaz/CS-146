
public class Node {

		Node next; 
		public Node getNext() {
			return next;
		}

		private Person p;
		public int index;
		
		public Node (int index, Person p)
		{
			 next = null;
			 this.p = p;
			 this.index = index;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Person getP() {
			return p;
		}

		public void setP(Person p) {
			this.p = p;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

	}

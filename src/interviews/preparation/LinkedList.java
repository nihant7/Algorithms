package interviews.preparation;

public class LinkedList {
	
	Link first;
	
	public void insertFirst(int value) {
		Link link = new Link(value);
		link.next = first;
		first = link;
	}
	
	
	public  void display() {
		Link link = first;
		while(link != null) {
			System.out.println(link.value);
			link = link.next;
		}
	}

	public static void main(String[] args) {
		LinkedList newLink = new LinkedList();
		newLink.insertFirst(40); 
		newLink.insertFirst(30);
		newLink.display();
	}

}

package linkedList;
class NodeT{
	int data; 
	NodeT next;
	NodeT(int x) {
	data =x;
	next = null;
	}
}

public class Traverse1 {

	public static void main(String[] args) {
		NodeT head = new NodeT(10); 
		head.next = new NodeT(20); 
		head.next.next = new NodeT(40); 
		head.next.next.next = new NodeT(90); 
		printList(head);
	}
	
	public static void printList(NodeT head)
	{
		if (head==null)
			return;
		System.out.println(head.data);
		printList(head.next);
	}
}





package linkedList;

public class InsertAtB {

	static Node insertHead(Node head , int x)
	{
		Node newel= new Node(x);
		newel.next=head;
		return newel;		
	}
	public static void main (String args[])
	{
 		Node head = null ;
		head = insertHead(head, 10);
		head = insertHead(head, 30);
		head = insertHead(head, 40);
	}
}
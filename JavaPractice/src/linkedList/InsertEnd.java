package linkedList;

public class InsertEnd {
	
	static Node InsertionEnd(Node head, int x)
	{
		Node newel= new Node(x);
		if (head==null)
		{
			return newel;
		}
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=newel;
		return head;
	}

	public static void main(String[] args) {
		Node head = null ;
		Node n1 = InsertionEnd(head, 10);
		Node n2 = InsertionEnd(head, 30);
		Node n3 = InsertionEnd(head, 40);
		
	}

}

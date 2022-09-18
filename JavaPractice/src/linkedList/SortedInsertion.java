package linkedList;

public class SortedInsertion {

	public Node SortedInsertionL(Node head,int x)
	{
		Node temp=new Node(x);
		if (head==null)
			return temp;
		if (x<head.data)
			{temp.next=head;
			return temp;}
		Node curr=head;
		while (curr.next!=null&&curr.next.data<x)
		{
			curr=curr.next;
		}
		curr.next=temp.next;
		temp=curr.next;
		return head;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

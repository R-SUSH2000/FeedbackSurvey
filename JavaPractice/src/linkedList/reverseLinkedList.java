package linkedList;
import java.util.ArrayList;
public class reverseLinkedList {

	public Node Reversal(Node curr, Node prev) {
		
		
		Node next= curr.next;
		curr.next=prev;
		return Reversal(next,curr);
		
		
	}
	public Node reList(Node head)
	{
		ArrayList<Integer> a1= new ArrayList<Integer>();
		for(Node curr=head; curr!=null;curr=curr.next)
		{
			a1.add(curr.data);
		}
		for(Node curr=head ; curr!=null ; curr=curr.next)
		{
			curr.data=a1.remove(a1.size()-1);
		}
		return head;
	}
	
}

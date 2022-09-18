package linkedList;

public class FindNthMiddleNode {

	public void NthMiddleNodeLen(Node head , int n)
	{
		
		Node curr;int c=0;
		for(curr=head;curr.next==null;curr=curr.next)
		{
			c++;
		}
		for(int i=0;i<c-n+1;i++)
		{
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	
	public void NthMiddleNode(Node head,int n)
	{
		if(head == null)
			return ;
		Node first=head;
		for(int i=0;i<n;i++)
		{
			if (first==null)
				return;
			first=first.next;
		}
		Node second= head;
		while(first.next!=null)
		{
			second = second.next;
			first= first.next;
		}
		System.out.println(second);
	}
	
	
	
}

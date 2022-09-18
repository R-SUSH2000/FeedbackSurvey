package linkedList;

public class insertMiddle {

	public static void insert(Node head)
	{
		if(head==null)
			System.out.println("null");
		if(head.next==null)
			System.out.println(head);
		 Node curr;int c=0;
		for(curr=head ;curr!=null;curr=curr.next)
		{
			c++;
		}
		for(int i=0;i<=c/2;i++)
		{
			curr=curr.next;
		}
		System.out.println(curr.data);
		
	}
	public static void insertPro(Node head)
	{
		Node slow=head,fast=head;
		while(fast!=null&fast.next!=null)
		{
			slow= slow.next;
			fast=fast.next.next;
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node(10); 
		Node n1 = new Node(10); 
		Node n2 = new Node(10); 
		head.next=n1;
		n1.next=n2;
		insert(head);
	}
}

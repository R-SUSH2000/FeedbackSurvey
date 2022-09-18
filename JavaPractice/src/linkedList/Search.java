package linkedList;

public class Search {

	
	public static void main(String[] args) {
		Node head = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Node n3 = new Node(40); 
		head.next=n1;
		n1.next=n2; 
		n2.next=n3;
		int x= searchIt(head,30);
		System.out.println(x);
//		int x= searchR(head,30);
//		System.out.println(x);
	}
	
	int searchR(Node head,int x ) {
		if(head==null)
			return -1;
		if(head.data==x)
		{
			return 1;
		}
		else {
		int r=searchR(head.next,x);
		if (r==-1) //number not present 
			return -1;
		else 
			return (r+1);
		}
	}
	
	static int searchIt(Node head,int x)
	{
		int t=1;
		
		while(head!= null)
		{
			if(head.data==x)
			{
				return t;
			}
			else {
			head=head.next;
			t++;}
		}
		return t;
	}
	
	
}

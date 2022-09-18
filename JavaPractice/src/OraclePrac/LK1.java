package OraclePrac;


 class node{
	node next;
//	node prev;
	int data;
	public node(int x) {
		this.data=x;
		next=null;
	//	prev=null;
		// TODO Auto-generated constructor stub
	}
}
public class LK1 {
	
	node Rev(node head)
	{
		node curr=head ;
		node prev=null;
		while(curr!=null)
		{
			node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}	
			
			
		{
			node next=curr.next;
			curr.next=prev;
			prev=curr; 
			curr=next;
		}
		return prev;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			node head= new node(12);
			node h1= new node(1);
			node h2= new node(10);			
	}

}

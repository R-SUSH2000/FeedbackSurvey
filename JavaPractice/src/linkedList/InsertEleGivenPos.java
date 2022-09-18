package linkedList;

public class InsertEleGivenPos {
	
	Node InsertPos(Node head,int pos,int data)
	{
		Node temp=new Node(data);
		if(head==null)
			{return temp;}
		if(pos==1)
			{temp.next=head;
			return temp;}
		Node curr=head;
		for(int i=1;i<=pos-2 && curr!=null;i++)
		{
			curr=curr.next;
		}
		temp.next=curr.next;
		curr.next=temp;
		return head;
//		while(curr!=null)
//		{
//			inpos++;
//			if(inpos+2==pos)
//			{
//				temp.next=curr.next;
//				curr.next=temp;
//				return head;
//			}
//			curr=curr.next;	
//			
//		}
//		return head;
	}

}

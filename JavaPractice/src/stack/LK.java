package stack;

class Node
	{
		int data; 
		Node next; 
		public Node(int x) {
			this.data=x;
			next=null;
		}
	}
public class LK {
	Node head; int size;
	public LK() {
		head= null;size=0;
	}
	int size() {return size;}
	boolean isEmpty() {
		return size==0;
	}
	void push(int x)
	{
		Node temp=new Node(x);
		temp.next= head;
		head = temp;
		size++;
	}
	int pop() {
		if(head== null) {return Integer.MAX_VALUE;}
		int x= head.data;
		head= head.next;
		size--;
		return x;
	}
	
}

package stack;

class Node2 {
	int data;
	Node2 next; 
	public Node2(int x) {
		this.data=x;
		next=null;
	}
}
public class LinkedListStack {
	
	Node2 head; int size;
	public LinkedListStack() {
		head=null;size=0;
	}
	void push(int x) {
		Node2 temp=new Node2(x);
		temp.next= head ; 
		head=temp;size++;
	}
	int pop() {
		int z=head.data;
		head =head.next;size --;
		return z;
	}

}

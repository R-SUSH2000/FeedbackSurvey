package stack;

import java.util.ArrayDeque;

class Node3{
	Node3 next;
	int data;
	public Node3(int x) {
		next=null;
		this.data=x;
	}
}

public class CollectionF {
	Node3 head;int size;
	void push(int x)
	{
		Node3 temp= new Node3(x);
		temp.next=head; 
		temp=head;
		size++;
	}
	int pop()
	{
		int x=head.data;
		head=head.next;
		size--;
		return x;
		
	}
	
	
	public static void main(String[] args) {
		ArrayDeque<Integer> s=new ArrayDeque<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.size());		
		System.out.println(s.isEmpty());		
	}

}

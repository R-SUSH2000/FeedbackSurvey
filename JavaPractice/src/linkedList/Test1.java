package linkedList;

 class Node {
	int data;
	Node next;
	Node(int x)
	{
		this.data=x;
		next=null;
	}
}
public class Test1 {

	public static void main(String[] args) {
		Node head=new Node(10); 
		Node n1=new Node(20); 
		Node n2=new Node(30); 
		head.next=n1;
		n1.next=n2;
	}
}

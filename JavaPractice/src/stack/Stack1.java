package stack;

public class Stack1 {
	
	int ar[];int cap, top;
	
	public Stack1(int s) {
		ar=new int[s];
		cap=s;top=-1;
	}	public void push(int i)
	{
		top++;
		ar[top]=i;
	}
	int peek() {
		return ar[top];
	}
	int pop() {
		int x=ar[top];
		top--;
		return x;
	}
	int size() {
		return top+1;
	}
	boolean isEmpty() {
		return (top==-1);
	}  
	public static void main(String[] args) {
		Stack1 s= new Stack1(5);
		s.push(5);
		s.push(15);
		System.out.println(s.pop());
		s.push(20);
//		System.out.println(s.peek());
//		System.out.println(s.pop());
//		s.push(35);
//		System.out.println(s.size());
//		System.out.println(s.isEmpty());
	}
	
	
}

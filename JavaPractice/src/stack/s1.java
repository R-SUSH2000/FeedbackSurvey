package stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class s1 {
	
	
	
	
	public static void main (String args[])
	{	
		Stack<Integer> s1= new Stack<Integer>();
		s1.push(20);
		s1.push(200);
		s1.push(20000);
		s1.push(2);
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println("---------------");
		 
		Queue<Integer> q1= new LinkedList();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		
	}
}

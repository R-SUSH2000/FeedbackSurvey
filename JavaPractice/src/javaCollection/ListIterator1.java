package javaCollection;
import java.util.*;

public class ListIterator1 {
	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		ListIterator<Integer> li1 = l1.listIterator();
		while(li1.hasNext())
		{
			System.out.println(li1.next());
		}
		System.out.println("----------------------");
		List<Integer> l2  = new ArrayList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		ListIterator<Integer> li2= l2.listIterator(l2.size());
		while(li2.hasPrevious())
		{
			System.out.println(li2.previous());
		}
		System.out.println("----------------------");
		List<Integer> l3  = new ArrayList<Integer>();
		l3.add(10);
		l3.add(20);
		l3.add(30);
		ListIterator<Integer> li3= l3.listIterator(l3.size());
		while(li3.hasPrevious())
		{
			int x=(Integer) li3.previous();
			li3.set(x*3);
		}
		System.out.println(l3);
		System.out.println("----------------------");
		List<Integer> l4= new ArrayList<Integer>();
		l4.add(10);
		l4.add(20); 
		l4.add(30);
		ListIterator<Integer> li4= l4.listIterator();
		while(li4.hasNext())
		{
			li4.add(5);
			li4.next();
		}
		System.out.println(l4);
	}
}

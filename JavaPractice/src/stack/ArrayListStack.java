package stack;
import java.util.*;
public class ArrayListStack {
		ArrayList<Integer> a1= new ArrayList<>();
		void push(int i) {
			a1.add(i);
		}
		int pop() {
			int x=a1.get(a1.size()-1);
			a1.remove(a1.size()-1);
			return x;
		}
		int peek() {
			return a1.get(a1.size()-1);
		}
		int size() {
			return a1.size();
		}
		boolean isEmpty() {
			return a1.isEmpty();
		}
}

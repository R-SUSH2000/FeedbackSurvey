package hashing;
import java.util.*;

public class chaining {

	int BUCKET; 
	ArrayList<LinkedList<Integer>> table  ; 

	chaining(int b) 
	{	BUCKET=b;
		table= new ArrayList<LinkedList<Integer>>();
		for (int i=0;i<b;i++)
		{ table.add(new LinkedList<Integer>()); }
	}
	void insert(int key) {
		int i= key%BUCKET;
		table.get(i).add(key);
	}
	void remove(int key) {
		int i= key%BUCKET;
		table.get(i).remove((Integer)i);
	}	
}

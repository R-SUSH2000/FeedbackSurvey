package hashing;

import java.util.HashSet;

public class PairOfGivenSum {
public static void main(String[] args) {
	int a[]= {3,2,8,15,-8};
	int sum=17;
	HashSet<Integer> s= new HashSet<>();
	
	for(int i=0;i<a.length;i++) {
	if(s.contains(sum-a[i]))
	{System.out.println("YES");}
	else
		s.add(a[i]);
	}
}
}

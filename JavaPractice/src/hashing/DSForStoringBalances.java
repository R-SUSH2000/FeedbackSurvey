package hashing;
import java.io.*;
import java.util.*;

class userlist{
	
	HashMap<Integer,Integer> map;

	public userlist() {
		map = new HashMap<Integer, Integer>();
	}
	void set(int s,int v)
	{ map.put(s, v);}
	
	int get(int s) 
	{return map.get(s);}

}

public class DSForStoringBalances {
	
	public static void main(String[] args) throws IOException {
		userlist u1 = new userlist();
		u1.set(1, 5000);
		u1.set(2, 500);
		System.out.println(u1.get(1));
		u1.set(0, 0);
		System.out.println(u1.get(1));
		
	}
	
}

package javaCollection;
import java.util.*;

class User{
	int id,balance; 
	public User(int id,int balance) {
		this.id=id;
		this.balance=balance;
	}
}

class UserList{
	ArrayList<User> a1;
	public UserList() {
		a1= new ArrayList<User>();
	}
	void set(int id,int balance) {
		a1.add(new User(id,balance));
	}
	int get(int id) {
		for(User a:a1)
		{ if (a.id==id)
				{return a.balance;}
		}
		return -1;
	}
}

public class DSForBank {
	
	public static void main(String[] args) {
		
	}
	
}

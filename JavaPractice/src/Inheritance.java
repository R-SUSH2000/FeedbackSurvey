
public class Inheritance {

	void eat(){System.out.println("eating...");}  
	
}  
class Dog extends Inheritance{  
	void bark(){System.out.println("barking...");}  
}  
class Cat extends Dog{
	void mewoo()
	{System.out.println("mewoo");}
}

class TestInheritance{ 
	
	public static void main(String args[]){  
	Cat c= new Cat();
	c.eat();
	c.bark();
	c.mewoo();
	
		}
	}





class Parent {
	
	Parent(){System.out.println("Parent()...");}

}

class Child extends Parent {
	Child(){System.out.println("Child()...");}
}

public class lambdaExp {
	
	    public static void main (String args[])
	    {
			//Create object of Child class object
			System.out.println("Constructor call order...");
			new Child();	
	    }
}

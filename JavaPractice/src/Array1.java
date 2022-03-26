import java.util.*;

public class Array1 {

	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array - ");
		float x[]= new float[5];
		float sum=0f;
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextFloat();
			sum+=x[i];
		}
		for (float element:x) {
			sum = sum +element;
			}
		System.out.println("Array elements are: ");  
		
		for (int i=0; i<5; i++)   
		{
		System.out.print(","+x[i]);
		}
		System.out.println("Sum = "+sum);
		
		sc.close();
	}

}

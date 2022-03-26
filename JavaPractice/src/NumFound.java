import java.util.Scanner;

public class NumFound {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Int to be checked-");
		int check=sc.nextInt();
		boolean found=false;
		int ar[]= {1,3,4,40};
		for(int element:ar)
		{
			if(element==check)
			{
				found=true;
				break;
			}
			
		}
		System.out.println(found);
		sc.close();
	}

}

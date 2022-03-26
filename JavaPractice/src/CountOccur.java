import java.util.Scanner;

public class CountOccur {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		while(n>0)
		{
			int no=n%10;
			if(no==3)
			{
				count++;
			}
			no=no/10;
		}
		System.out.println(count);
	sc.close();}


}

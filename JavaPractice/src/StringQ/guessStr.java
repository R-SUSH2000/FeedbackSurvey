package StringQ;

import java.util.Scanner;

public class guessStr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int s=sc.nextInt();
		char []a1=sc.next().toCharArray();
		char []a2=sc.next().toCharArray();
		
		while(s-->0)
		{
			for(int i=0;i<5;i++)
			{
				if(a1[i]==a2[i])
					System.out.print("B");
				else System.out.println("G");
			}
		}
		sc.close();
	}

}

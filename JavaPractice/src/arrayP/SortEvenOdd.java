package arrayP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class SortEvenOdd {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String st= in.readLine();
		String[] st1= st.split(" ", s);
		 int ar[]=new int[s];
		 int start=0,end = s-1;
		for(int i=0; i<s;i++)
		{
			int x= Integer.parseInt(st1[i]);
			if(x%2==0)
			{
				ar[start]=x;
				start++;
			}
			else 
			{
				ar[end]=x;
				end--;
			}
		}
		for (int a:ar)
		{
			System.out.print(a+" ");
		}
//		 for (String a:st1)
//			{
//					System.out.println(""+a);
//			}
		
		
		
	}

}

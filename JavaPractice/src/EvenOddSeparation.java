import java.io.*;
import java.util.Arrays;
public class EvenOddSeparation {
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	String s=br.readLine();
	String[] c= s.split(" ");
	int ar[]=new int[c.length];
	for(int i=0;i<c.length;i++)
		{
			ar[i]=Integer.parseInt(c[i]); 
		}
	int left=0,right=ar.length-1;
	while (right>left)
	{
		while(ar[left]%2==0&&left<right) {left++;}
		while(ar[right]%2==1&&left<right) {right--;}
		if(left<right)
		{
			int t=ar[left];
			ar[left]=ar[right];
			ar[right]=t;
		}
	}
	System.out.println(Arrays.toString(ar));
//	for(int n:ar) {
//		System.out.print(n+" ");
//	}
	}
}
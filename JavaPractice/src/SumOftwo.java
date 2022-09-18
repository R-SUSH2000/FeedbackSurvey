import java.util.*;
public class SumOftwo {
	
	public static void main(String[] args) {
		int x=78;
		int sum =0 ;
		while(x>0||sum>9)
		{
			if(x==0) {x=sum;sum=0;}
			sum+=x%10;
			x/=10;
		}
		System.out.println(sum);
		
	}


}

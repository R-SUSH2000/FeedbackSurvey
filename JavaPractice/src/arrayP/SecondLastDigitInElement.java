package arrayP;

import java.util.Arrays;

public class SecondLastDigitInElement {

   void SecondLastDigit(int ar[]) {
    	
    	int b[],i=0;
    	if(ar.length==0)
    	{
    		b=new int[1];
    		b[0]=-1;
    	
    	}
    	else
    	{
    		b=new int[ar.length];
    		for(int x:ar)
    		{
    			if(x<0)
    			{
    				x*=-1;
    			}
    			x=x%10;
    			x=x/10;
    			b[i]=x;
    			i++;
    		}
    		
    	}
    	System.out.println("in - "+ Arrays.toString(ar));
    	System.out.println("in - "+ Arrays.toString(b));
	}
	
	public static void main(String[] args) {
		int ar[]= {123,32,13,13,-213};
		SecondLastDigitInElement a1=new SecondLastDigitInElement();
		a1.SecondLastDigit(ar);
}
}
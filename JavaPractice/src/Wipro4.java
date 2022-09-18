import java.util.HashSet;
public class Wipro4 {

	int FindN(int[] ar,int n) {
		int c = -1;boolean t=false;int d=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=n-1; i>=0; i--)
        {            
        	if (ar[i]<=0) {
        		t=true;d++;
        		continue;
        	}
        	else if (set.contains(ar[i]))
                c= i;
             else   
            	 set.add(ar[i]);
        }
        if (c!= -1)
            return ar[c];
        else if (c==-1 && t==true && d==n-1) {
        	return 0;
        }
         else
            return ar[n-1]; 
	}
	public static void main(String[] args) {
		Wipro4 w = new Wipro4();int []ar= {1,-1,2};
		System.out.println(w.FindN(ar, 3));
	}
}

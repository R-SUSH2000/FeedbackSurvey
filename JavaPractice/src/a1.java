import java.util.*;
public class a1 {
	  public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    ArrayList<Integer> num=new ArrayList<Integer>();
	    while(sc.hasNextInt())
	    {
	        int x=sc.nextInt();
	        num.add(x);
	    }
	    
	    for (int i=0;i<num.size();i++)
	    {
	    	int low =0;
	        for(int j=i+1;j<num.size();j++)
	        {
	            if (num.get(i)>num.get(j))
	                low++;
	        }
	        System.out.print(low+",");
	    }    

	  }
	}



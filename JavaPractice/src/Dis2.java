
public class Dis2 {
	   static boolean increasing(String A) {
	        int n = A.length();
	        for (int i = 0; i < n - 1; ++i)
	            if (A.charAt(i) > A.charAt(i + 1))
	                return false;
	        return true;
	    }

	    static boolean decreasing(String A) {
	        int n = A.length();
	        for (int i = 0; i < n - 1; ++i)
	            if (A.charAt(i) < A.charAt(i + 1))
	                return false;
	        return true;
	    }

	    static String findTheOrder(String input1, String input2) {
	        int n = input1.length();
	        int count = 0;String s,s2;
	        
	        if (increasing(input1) == true) {
	            s="Increasing:";
	            for (int i = 0; i < n; i++) {
	                if (input1.charAt(i) != input2.charAt(i))
	                    count++;
	            }
	            s2=Integer.toString(count);
	            
	            return s.concat(s2);
	        }
      
	        else if (decreasing(input1) == true) {
	            s="Decreasing:";
	            for (int i = 0; i < n; i++) {
	                if (input1.charAt(i) != input2.charAt(i))
	                    count++;
	            }
	            s2=Integer.toString(count);
	            return s.concat(s2);
	        }
	        else
	            return "invald";
	        	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

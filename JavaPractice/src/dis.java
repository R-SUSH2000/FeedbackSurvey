public class dis {
	int th(int a,int b,int c) {
		int x=a/1000;
		int y=(b/100)%10;
		int largest=0;
		while(c != 0)
	    {    int t = c % 10;
	        largest = Math.max(t, largest);
	        c= c/10;
	    }
		return (x*y)-largest;-
	}	
	
	public static void main(String[] args) {
		dis s= new dis();
		System.out.println(s.th(3521,2452,1352));
	}	
}
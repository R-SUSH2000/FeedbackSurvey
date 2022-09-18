
public class RevNumber {

	public static void main(String[] args) {
		int x=1234,rev=0;
		while(x>0)
		{
			int t=x%10;
			rev=rev*10+t;
			x=x/10;
		}	
		System.out.println(""+rev);
	}

}
	
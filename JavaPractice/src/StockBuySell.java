
public class StockBuySell {

	int maxProfitN(int[] price,int start, int end ) {
		
	
	
	}
	
	int maxProfit(int []price) {
		int p=0;
		for(int i=0;i<price.length;i++)
		{
			if(price[i]>price[i-1])
			{
				p=p+(price[i]-price[i-1]);
			}
		}return p;
		
	}
	public static void main(String args[])
	{
		int []a= {10,20,5,40,4};		
		StockBuySell st= new StockBuySell();
		int pn=st.maxProfitN(a, a[0], a[a.length-1]);
		int pd=st.maxProfit(a);
		System.out.println("naive-"+pn+"dimag"+pd);
	}
}

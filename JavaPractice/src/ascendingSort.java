
public class ascendingSort {

	boolean ascSort(int ar[]){
		for (int i=1;i<ar.length;i++)
		{
			if(ar[i]<ar[i-1])
			{
				return false;
			}
		}return true;
	}
	public static void main(String[] args) {
		int ar[]= {12,22,33,45};
		ascendingSort ac= new ascendingSort();
		boolean s=ac.ascSort(ar);
		System.out.println(s);

	}

}

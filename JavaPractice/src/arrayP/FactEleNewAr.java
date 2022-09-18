package arrayP;
public class FactEleNewAr {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int ar1[]=new int[ar.length]; 
		for(int i=0;i<ar.length;i++)
		{
			int fact=1; 
			for (int j=1;j<ar[i];j++)
			{fact= fact*j;}
			ar1[i]=fact;
		}
		for (int x:ar1)
			System.out.println(x);
	}

}

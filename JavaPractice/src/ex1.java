
public class ex1 {
public static void main(String[] args) {
		int ar[]= {1,8,30,-5,20,7};
		int k=3;int maxSum=-1;
		for(int i=0;i+k-1<ar.length ;i++) {
			int sum=0;
			for(int j=0;i<k;j++)
			{sum=sum+ar[i+j];}
			Math.max(sum, maxSum);	
			}
	}
	

}

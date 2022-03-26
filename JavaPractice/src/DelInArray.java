
public class DelInArray {

	
	public static void main(String[] args) {
		int arr[]={1,2,4,5};
		int x=3,i;
		for(i=0;i<=(arr.length-1);i++)
		{
			if(arr[i]==x)
			break;
		}
		if(i==x)
		{
			System.out.println("not found");
		}
		for(int j=i;j<(arr.length-1);j++)
			arr[j]=arr[i];
		System.out.println("hyh - "+(arr.length-1));

	}

}

public class Add2d {

	public static void main(String[] args) {
	int [][] m1= {{1,2,3},{5,7,8}};
	int [][] m2= {{10,20,30},{50,70,80}};
	int [][] r = {{0,0,0},{0,0,0}};
	
	for (int i=0;i<m1.length;i++)
	{
		for (int j=0;j<m1[i].length;j++)
		{
			r[i][j]=m1[i][j]+m2[i][j];
		}
		
	}
	
	for (int i=0;i<m1.length;i++)
	{
		for (int j=0;j<m1[i].length;j++)
		{
			System.out.println(r[i][j]);
		}
		
	}
	}

}

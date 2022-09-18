package OraclePrac;

public class multi extends Thread{
	public void run() {
		int i=0;
		while(i<6)
		{
			System.out.println(i);
			i++;
		}
		Thread.sleep(100);
		}
	}
	

}

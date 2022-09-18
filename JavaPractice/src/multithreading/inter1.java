package multithreading;

 class inter1 implements Runnable {
	@Override
	public void run() {
		System.out.println("In test Thread");
	}
}
class main1
{
	public static void main(String args[])
	{
		Thread t= new Thread(new inter1());
		t.start();
		System.out.println("In main method");
	}
}


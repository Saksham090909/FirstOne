package training;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		String str = new String("Hello World!!!");
		str = null;
		System.gc();
		Thread.sleep(5);
		System.out.println("Main method ended");
	}
	
	@Override
	protected void finalize()
	{
		System.out.println("finalize revoked");
	}
}

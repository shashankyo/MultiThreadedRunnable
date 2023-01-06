package multirunnable;

public class Program2 implements Runnable{
	public void run()
	{
		try {
			System.out.println("ADDITION STARTED");
			int a = 10;
			int b = 20;
			int c  = a+ b;
			Thread.sleep(5000);
			System.out.println(c);
			System.out.println("Addition Ended");
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
}

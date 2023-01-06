package multirunnable;

import java.util.Scanner;

public class Program1 implements Runnable{
	public void run()
	{
		try
		{
			System.out.println("Banking started");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter account Number");
			int an = scan.nextInt();
			System.out.println("Enter the password");
			int pw = scan.nextInt();
			Thread.sleep(5000);
			System.out.println("collect your money");
			System.out.println("Banking ended");
		}
		
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
	}


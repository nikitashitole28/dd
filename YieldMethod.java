package nik;

public class YieldMethod extends Thread {

	public void run() {
		
		Thread.yield();
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println(Thread.currentThread().getName() + " - " + i);

		}
	}

	public static void main(String[] args) 
	{
		YieldMethod y =new YieldMethod();
		y.start();
		
		//Thread.yield();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		
		

	}

}
/* OUTPUT 
main - 1
main - 2
Thread-0 - 1
Thread-0 - 2
main - 3
Thread-0 - 3
main - 4
Thread-0 - 4
main - 5
Thread-0 - 5
*/
package nik;

class Medical extends Thread {
	public void run()
	{
		try
		{
			System.out.println(" medical starts");
			Thread.sleep(2000);
			System.out.println("medical completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
	class TestDrive extends Thread
	{
		public void run()
		{
			try
			{
				System.out.println("test drive starts");
				Thread.sleep(5000);
				System.out.println("test drive completed");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	
	class OfficerSign extends Thread{
		public void run()
		{
			try
			{
				System.out.println("officer take  the file");
				Thread.sleep(4000);
				System.out.println("officer work completed");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
		
	
 public class JoinMethod{
	public static void main(String[] args) throws InterruptedException {
		Medical jm=new Medical();
	 jm.start();
	 
	 jm.join();
	 
	 TestDrive td=new TestDrive();
	 td.start();
	 
	 td.join();
	 
	 OfficerSign os=new OfficerSign();
	 os.start();
	 
	 
		

	}

}
/* medical starts
 medical completed
 test drive starts
 test drive completed
 officer take  the file
 officer work completed*/
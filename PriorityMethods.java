package nik;

public class PriorityMethods extends Thread {

	public void run() {

		System.out.println("child thread");
		System.out.println(" child thread priority : " + Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {
			System.out.println("main thread old priority : "+Thread.currentThread().getPriority());
			Thread.currentThread().setPriority(NORM_PRIORITY);
			System.out.println("main thread new priority : "+Thread.currentThread().getPriority());
			PriorityMethods pm=new PriorityMethods();
			pm.setPriority(6);
			pm.start();
	

		}

}
/* Output
  main thread old priority : 5
  main thread new priority : 5
  child thread
  child thread priority : 6

 */


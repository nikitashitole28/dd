package nik;

public class IsDaemonThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Daemon thread");
	}

	public static void main(String[] args) {
		System.out.println("main thread");
		IsDaemonThread t = new IsDaemonThread();
		t.setDaemon(true);
		t.start();

	}

}
/* Output
main thread
true
Daemon thread */

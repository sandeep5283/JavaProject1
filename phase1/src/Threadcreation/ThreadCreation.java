package Threadcreation;

public class ThreadCreation extends Thread {
	public void run() {
		System.out.println("thread running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCreation t= new ThreadCreation();
		t.start();

	}

}

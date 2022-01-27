package Exception;

public class SleepWait {
	private static Object o=new Object();
	
	

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		System.out.println("Thread"+ Thread.currentThread().getName()+"is woken after sleeping for 1 sec");
		synchronized(o) {
			o.wait(5000);
			System.out.println("Object"+o+"is woken after"+"waiting for 1 second");
		}

	}

}

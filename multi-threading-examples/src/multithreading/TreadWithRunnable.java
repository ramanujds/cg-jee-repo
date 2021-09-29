package multithreading;

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("From Thread 1 - i = "+i);
			if(i==3) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
}
}
	
	class MyRunnable2 implements Runnable{
		@Override
		public void run() {
			for(int i=100; i<120; i++) {
				System.out.println("From Thread 1 - i = "+i);
				}
			
		}
	}


public class TreadWithRunnable {


	public static void main(String[] args) {
		
		Runnable r1 = new MyRunnable1();
		Runnable r2 = new MyRunnable2();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();

		t2.start();
		

	}

}

//
//Thread t1 = new Thread(() -> {
//	for (int i = 0; i < 20; i++) {
//		System.out.println("From Thread 1 - i = " + i);
//		if (i == 3) {
//
//			Thread.yield();
//
//		}
//
//	}
//});
//
//Thread t2 = new Thread(() -> {
//	for (int i = 100; i < 120; i++) {
//		System.out.println("From Thread 1 - i = " + i);
//	}
//});

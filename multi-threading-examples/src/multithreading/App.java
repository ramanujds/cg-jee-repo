package multithreading;

class MyThread1 extends Thread{

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

class MyThread2 extends Thread{

	@Override
	public void run() {
		for(int i=100; i<120; i++) {
			System.out.println("From Thread 2 - i = "+i);
		}
	}
}

public class App {

	
	
	public static void main(String[] args) {
		Thread thread1=new MyThread1();
		Thread thread2=new MyThread2();
		
		thread1.start();
		
		thread2.start();
	}
	
	
	
}

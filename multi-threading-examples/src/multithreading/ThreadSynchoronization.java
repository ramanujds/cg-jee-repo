package multithreading;

class Multiplication {
	public int printMultiplication(int n) {
		int x=n;
		int f=1;
		while(x>0) {
			f*=x;
			x--;
		}
		
		synchronized (this) {
			
		
		for(int i=1; i<=10; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
		}
		return f;
	}
}

public class ThreadSynchoronization {

	public static void main(String[] args) {
		
		Multiplication m1=new Multiplication();
		
		Runnable r1= new Runnable() {
			
			@Override
			public void run() {
				
				int f1=m1.printMultiplication(3);
				System.out.println("Fact 1 = "+f1);
			}
		};
		
		Runnable r2= new Runnable() {
			
			@Override
			public void run() {
				
				int f1=m1.printMultiplication(5);
				System.out.println("Fact 2 = "+f1);
			}
		};
		
		Thread thread1=new Thread(r1);
		Thread thread2=new Thread(r2);
		
		
		thread1.start();
		thread2.start();

	}

}

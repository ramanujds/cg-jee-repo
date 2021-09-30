package multithreading;

class Paytm{
	
	int balance=100;
	public synchronized void addMoney(int amount) {
		balance+=amount;
		System.out.println("Amount added successfully");
		notifyAll();
	}
	
	public synchronized void recharge(int amount) throws InterruptedException {
		if(amount>balance) {
			System.out.println("Insufficient Amount.. Waiting for amount to be added");
			wait();
			System.out.println("Trying to recharge now..");
		}
		
			System.out.println("Recharge Done");
			
		
	
	
}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Paytm paytm=new Paytm();
		
		Runnable addMoneyR=new Runnable() {
			
			@Override
			public void run() {
				paytm.addMoney(300);
				
			}
		};
		
		Runnable rechargeR=new Runnable() {
			
			@Override
			public void run() {
				
				try {
					paytm.recharge(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Thread rechageThread=new Thread(rechargeR);
		
		rechageThread.start();
		
		Thread addMoneyThread= new Thread(addMoneyR);
		
		addMoneyThread.start();

	}

}

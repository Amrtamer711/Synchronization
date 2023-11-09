package semaphore_method;
public class Withdrawer extends Thread {
	private Account account ;
	public Withdrawer(Account account){
		this.account = account;
	}
	
	public void run(){
		try {
			account.getS().acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Withdraw 10 AED into instance variable account
		for (int i=0;i<10000000;i++)
		{
			account.withdraw(10);

		}
		account.getS().release();
		
	}

}
package lockBlock;

public class Withdrawer extends Thread {
	private Account account ;
	public Withdrawer(Account account){
		this.account = account;
	}
	
	public void run(){

	
		// Withdraw 10 AED into instance variable account
		for (int i=0;i<1000000;i++)
		{
			account.withdraw(10);
			

		}

		
	}

}
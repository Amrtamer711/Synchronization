package lockMethod;

public class Withdrawer extends Thread {
	private Account account ;
	public Withdrawer(Account account){
		this.account = account;
	}
	
	public void run(){

	
		for (int i=0;i<1000000;i++)			
		{	
			account.getLock().lock();
			try {
				account.withdraw(10);
			}
			finally{
				account.getLock().unlock();
			}
			

		}

		
	}

}
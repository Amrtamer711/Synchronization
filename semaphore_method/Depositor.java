package semaphore_method;
public class Depositor extends Thread {
	private Account account ;
	public Depositor(Account account){
		this.account = account;
	}
	
	public void run(){
		try {
			account.getS().acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i=0;i<10000000;i++)
		{
			account.debosit(10);

		}
		account.getS().release();
		
	}

}
package lockBlock;
public class Depositor extends Thread {
	private Account account ;
	public Depositor(Account account){
		this.account = account;
	}
	
	public void run(){
		
		
		for (int i=0;i<1000000;i++)
		{
			account.debosit(10);
	
		}
		
		
	}

}




package blockLevelSynching;
public class Depositor extends Thread {
	private Account account ;
	public Depositor(Account account){
		this.account = account;
	}
	
	public void run(){
		
		
		for (int i=0;i<1000000;i++)
		{
			account.debosit(10);
		/*			
 		try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
		
	}

}




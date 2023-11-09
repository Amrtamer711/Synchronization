package peterson;
public class Depositor extends Thread {
	int a = 0;
	int b = 1 - a;
	private Account account ;
	public Depositor(Account account){
		this.account = account;
	}
	
	public void run(){
		
		this.account.flag[a] = true;
		this.account.turn = b;
		while (this.account.flag[b] && this.account.turn == b) Thread.yield();
		sleep(1000 * Math.random());
		for (int i=0;i<10000000;i++)
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
		this.account.flag[a] = false;
	}
	static void sleep(double t) {
	    try { Thread.sleep((long)t); }
	    catch (InterruptedException e) {}
	  }

}




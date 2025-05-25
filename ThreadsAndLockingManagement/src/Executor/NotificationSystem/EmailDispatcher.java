package Executor.NotificationSystem;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmailDispatcher {
	
	public ExecutorService e;
	int poolSize;
	
	EmailDispatcher(int poolSize){
		this.poolSize=poolSize;
		this.e=Executors.newFixedThreadPool(poolSize);
	}
	
	Future<Email> submit(Email email) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return e.submit(new EmailSender(email));
	}
	
	void shutdown()  {
		
		e.shutdown();
System.out.println("Shuting Down dispatcher");
	}
	
}

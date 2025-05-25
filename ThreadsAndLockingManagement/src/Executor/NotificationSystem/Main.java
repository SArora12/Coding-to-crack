package Executor.NotificationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
	EmailDispatcher dispatcher=new EmailDispatcher(5);
	List<Future<Email>> futures=new ArrayList<>();
	
	
	 futures.add( dispatcher.submit(new Email("alice@example.com", "Welcome!", "Thanks for signing up.")));
   futures.add(  dispatcher.submit(new Email("bob@example.com", "Reminder", "Don't forget our meeting.")));
   futures.add(   dispatcher.submit(new Email("carol@example.com", "Sale!", "50% off today only!")));
   futures.add(   dispatcher.submit(new Email("dave@example.com", "Alert", "Suspicious login detected.")));
   futures.add(  dispatcher.submit(new Email("eve@example.com", "Weekly Newsletter", "Here's what you missed.")));
     
     for(Future<Email> future:futures) {
    	 future.get();
     }
    dispatcher.shutdown();
	}	
}

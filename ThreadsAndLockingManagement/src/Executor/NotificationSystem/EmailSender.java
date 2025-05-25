package Executor.NotificationSystem;

import java.util.concurrent.Callable;

public class EmailSender implements Callable{
	private Email email;

	EmailSender(Email email){
		this.email=email;
	}
	
	public Object call() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
System.out.println("Sending email ->"+email);
return email;
	}
	
	
}

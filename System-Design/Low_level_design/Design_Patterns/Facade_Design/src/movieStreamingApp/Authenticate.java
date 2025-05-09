package movieStreamingApp;

public class Authenticate {
	String emailId="test@gmail.com";
		
	public boolean isauthenticated(String mailId) {
		System.out.println("Authenticating user.....");
		if(this.emailId.equals(mailId)){
			return true;
		}
		return false;
	}
	
	
}

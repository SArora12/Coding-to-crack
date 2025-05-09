package movieStreamingApp;

public class MovieFacade {

	Authenticate authenticate;
	Payment payment;
	UpdateWatchHistory update;
	Streaming stream;
	
	MovieFacade(){
		this.authenticate=new Authenticate();
		this.payment=new Payment();
		this.update=new UpdateWatchHistory();
		this.stream=new Streaming();
	}
	
	public void watchMovie(String email,String movie) {
		if(!authenticate.isauthenticated(email)) {
			System.out.println("User is invalid");
		}
		else {
			System.out.println("User is valid");
		}
		if(!payment.hasSubsription(email)) {
			System.out.println("Your subsription is ended");
		}
		update.updateHistory(email, movie);
		stream.streaming(movie);
	}
}

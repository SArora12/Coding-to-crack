package movieStreamingApp;

public class Main {

	public static void main(String[] args) {
		
		MovieFacade movieObj=new MovieFacade();
		String email="test@gmail.com";
		String movie="Border";
		movieObj.watchMovie(email, movie);
		
	}

}

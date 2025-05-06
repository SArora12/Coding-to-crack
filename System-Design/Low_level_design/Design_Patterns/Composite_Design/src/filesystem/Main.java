package filesystem;

public class Main {
	public static void main(String args[]) {
		
		Directory moviedir=new Directory("Movies");
		FileSystem movie1=new File("Border");
		moviedir.add(movie1);
		
		Directory comedymovie=new Directory("Comedy Movies");
		FileSystem movie2=new File("Golmaal");
		comedymovie.add(movie2);
		moviedir.add(comedymovie);
		moviedir.ls();
	
}
}
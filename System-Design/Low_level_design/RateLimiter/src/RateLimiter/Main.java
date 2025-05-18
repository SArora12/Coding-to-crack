package RateLimiter;

public class Main {

	public static void main(String[] args) {
		SlidingWindow limiter=new SlidingWindow(10,1);
		for(int i=1;i<30;i++) {
			if(limiter.allowReq("user1")) {
				System.out.println("Request Allowed");
			}
			else {
				System.out.println("Request blocked");
			}
		}

	}

}

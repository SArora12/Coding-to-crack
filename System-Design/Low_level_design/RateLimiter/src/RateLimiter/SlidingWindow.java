package RateLimiter;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SlidingWindow {
	private final int maxRequest;
	private final long timeInMillis;
	Map<String,Deque<Long>> userRequests;
	
	public SlidingWindow(int maxReq,long windowSizeInsec){
		this.maxRequest=maxReq;
		this.timeInMillis=windowSizeInsec*1000;
		this.userRequests=new HashMap<>();
	}
	
	public boolean allowReq(String userId) {
		userRequests.putIfAbsent(userId, new LinkedList<>());
		Long currentTime=System.currentTimeMillis();
		Deque<Long> timestamps=userRequests.get(userId);
		if(!timestamps.isEmpty() &&  (currentTime-timestamps.peekFirst()>timeInMillis)) {
			timestamps.pollFirst();
		}
		if(timestamps.size()<maxRequest) {
			timestamps.add(currentTime);
			return true;
		}
		return false;
	}
	
}

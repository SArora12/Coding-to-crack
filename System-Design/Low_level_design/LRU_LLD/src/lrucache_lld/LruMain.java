package lrucache_lld;

import java.util.HashMap;
import java.util.Map;

public class LruMain {

	public static void main(String[] args) {
		 Map<String, Integer> map = new HashMap<>();
	        map.put("age", 23);
	        
		LRUCache lru=new LRUCache(2);
		lru.put("Simran",map);
		  Object result = lru.get("Simran");
	        System.out.println("Retrieved: " + result);
	        

	        
	}

}

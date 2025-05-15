package lrucache_lld;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<T> {
	private final int capacity;
	 int size;
	
	 Map<String,Node> hashmap;
	DoublyLinkedList internalqueue;
	
	
	LRUCache(int cap){
		this.capacity=cap;
		this.hashmap=new HashMap<>();
		this.internalqueue=new DoublyLinkedList();
		this.size=0;
	}
	
	T get(String key) {
		Node node=hashmap.get(key);
		if(node==null) {
			return null;
		}
		internalqueue.moveNodeToFront(node);
		return node.value;
		
	}
	
	void put(String key, T value) {
		Node node=hashmap.get(key);
		if(node!=null) {
			node.value=value;
			internalqueue.moveNodeToFront(node);
			return;
		}
		if(size==capacity) {
			String rearKey=internalqueue.getRearKey();
			internalqueue.removeFromRear();
			hashmap.remove(rearKey);
			size--;
		}
		Node newNode=new Node(key,value);
		internalqueue.addToFront(newNode);
		hashmap.put(key, newNode);
		size++;
		
	}
	
	private class Node{
		String key;
		T value;
		Node next,prev;
		
		Node(String key, T value){
			this.key=key;
			this.value=value;
			this.next=null;
			this.prev=null;
		}
		
	}
	
	
	private class DoublyLinkedList{
		Node front,rear;
		DoublyLinkedList(){
			this.front=null;
			this.rear=null;
		}
		
		void moveNodeToFront(Node node) {
			if(front==node) {
				return;
			}
			if(node==rear) {
				rear=rear.prev;
				rear.next=null;
			}
			else {
			node.prev.next=node.next;
			node.next.prev=node.prev;
		}
			node.prev=null;
			node.next=front;
			front.prev=node;
			front=node;
		}
		void addToFront(Node node) {
			if(rear==null) {
				front=rear=node;
				return;
			}
			
			node.prev=null;
			node.next=front;
			front.prev=node;
			front=node;
		}
		String getRearKey() {
			return rear.key;
		}
		void removeFromRear() {
//			if(rear==null) {
//				System.out.println("Cache is empty");
//				return;
//			}
			System.out.println("Deleting key "+rear.key);
			if(front==rear) {
				front=rear=null;
			}
			else {
				rear=rear.prev;
				rear.prev=null;
			}
			
		}
	}
}

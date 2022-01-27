package queue;

import java.util.*;

public class Queue 
{
public static void main(String[] args) 
{
        		LinkedList<String> locationsQueue = new LinkedList<>();
locationsQueue.add("Kolkata");
        		locationsQueue.add("Eluru");
        		locationsQueue.add("Bhimavaram");
        		locationsQueue.add("vyzag");
        		locationsQueue.add("Noida");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}

package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> h=new HashMap<Integer,String>();
h.put(1, "ram");
h.put(2, "sam");
System.out.println("\n elements of hash map  are");
for(Map.Entry m:h.entrySet()) {
	System.out.println(m.getKey()+ ""+m.getValue());
	
}
Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
ht.put(3,"raj");
ht.put(4, "kim");
System.out.println("\n the elements of hash table are");
for(Map.Entry n:ht.entrySet() ) {
	System.out.println(n.getKey()+""+n.getValue());
}
TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
tm.put(5, "john");
tm.put(6, "jack");
System.out.println("elements of tree map are");
for(Map.Entry l:tm.entrySet()) {
	System.out.println(l.getKey()+" " +l.getValue());
}

	}

	

}

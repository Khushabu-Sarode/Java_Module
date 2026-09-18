package Students;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,Integer> map = new HashMap<>();
       
       map.put(101, 87);
       map.put(102, 82);
       map.put(111, 89);
       map.put(121, 98);
       
       Set<Entry<Integer, Integer>> set = map.entrySet();
       System.out.println("elements in map: ");
       for(Entry<Integer, Integer> entry : set) {
//    	      Entry<Integer, Integer> entry;
			  System.out.println(entry.getKey() + ":" + entry.getValue());
       }
       
       int id = 102;
       System.out.println( "marks of student : " +id + " = " + map.get(id));
       
       map.put(103, 22);
       System.out.print(map.get(103));
       
       
       map.remove(111);
       System.out.println("after removing");
       System.out.println(map);
       
       int maxmarks = 0;
       int maxid = 0;
       
       for(Map.Entry<Integer,Integer> e : set) {
    	    if(e.getValue() > maxmarks) {
    	    	 maxmarks = e.getValue();
    	    	 maxid = e.getKey();
    	    }
       }
       
       System.out.println("Maxmarks : " + maxmarks);
       System.out.println("id of student : " +maxid);
       
	}

}

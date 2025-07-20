package TimePass;
import java.util.*;
import java.util.Map.Entry;

public class PracticeSet1 {
   
    
public static void main(String[] args) {
//    	 List<Integer> st = new ArrayList<Integer>(); 
//    	 st.add(2); 
//    	 st.add(4); 
//    	 st.add(6);
//    	st.add(10);
//    	st.add(20); 
//    	st.add(30); 
////    	 for(int i=0; i<st.size(); i++) {
////    		 System.out.println(st.get(i));
////    	 }
//    	st.set(2, 40);
//    	
//    	st.clear();
//
//    	System.out.println(st);
	Map <Integer, String> st = new HashMap<>(); 
	st.put(1, "bilal"); 
	st.put(2, "tohid"); 
	st.put(3, "dk"); 
	st.put(4, "yocus"); 
	
	System.out.println(st.get(3)); 
	Set<Entry<Integer, String>> s = st.entrySet(); 
	
	for(Entry<Integer, String> x :s) {
		System.out.println(x.getKey());
	}
    	 
    }
}



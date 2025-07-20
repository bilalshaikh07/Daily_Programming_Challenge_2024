package TimePass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		//return o1 - o2;// ascending order
		return o2 - o1;  //descending order 
		
	}
	//it come negative then o1 come before 
}

public class PRACT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list = new ArrayList<Integer>(); 
		
		list.add(1); 
		list.add(3);
		list.add(2);
		System.out.println(list);
		
		list.sort(new MyComparator());
		System.out.println(list);
	}

}

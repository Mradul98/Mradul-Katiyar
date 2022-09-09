package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LinkedList_Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=List.of("Meena","Rajesh","Madhuri","Guddu","Niket","Himanshu","Mradul","Priyanshu");
		ArrayList<String> arraylist=new ArrayList<>(list);
		
		System.out.println(arraylist);
		
		Collections.swap(arraylist, 0, 1);
		System.out.println(arraylist);
		
//		arraylist.removeAll(arraylist);
//		System.out.println(arraylist);
		
		HashMap<String,Integer> hashmap=new HashMap<>();
		
		for(int i=0;i<arraylist.size();i++)
		{
			hashmap.put(arraylist.get(i),i);
		}
		
		System.out.println(hashmap);

	}

}

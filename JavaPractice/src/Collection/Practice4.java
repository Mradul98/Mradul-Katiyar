package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list1=List.of("Green","Orange","Red","Yellow","White","Black");
		
//		System.out.println(list1);
//		
//		List<String> list2=list1.subList(0, 4);
//		System.out.println(list2);
//		
		
		ArrayList<String> arraylist=new ArrayList<String>(list1);
		
		Collections.swap(arraylist, 1, 2);
		System.out.println(arraylist);
		
		
		
		
		

	}

}

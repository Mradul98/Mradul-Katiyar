package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=List.of(12,1,234,456,30,2,8,0,123);
		ArrayList<Integer> arraylist=new ArrayList<>(list);
		System.out.println(arraylist);
		
//		for(Integer number:arraylist)
//		{
//			System.out.println(number);
//		}
		
//		Iterator<Integer> iterator=arraylist.iterator();
//		
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		
		Collections.sort(arraylist);
		System.out.println(arraylist);

	}

}

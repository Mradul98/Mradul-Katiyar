package Collection;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set=Set.of("Apple","Banana","Mango");
		System.out.println(set);
		
		HashSet<String> hashset=new HashSet<String>(set);
		hashset.add("pple");
		System.out.println(hashset);

	}

}

package Collection;
import java.util.*;

import java.util.LinkedList;

public class LinkedList_Practice4 {

	public static void main(String[] args) {
		
		
		LinkedList<String> linkedlist1=new LinkedList<String>();
		LinkedList<String> linkedlist2=new LinkedList<String>();
		LinkedList<String> linkedlist3=new LinkedList<String>();
		LinkedList<String> linkedlist4=new LinkedList<String>();
		
		linkedlist1.add("Mrdaul");
		linkedlist1.add("Amar");
		linkedlist1.add("Shikhar");
		linkedlist1.add("Arjit");
		
		System.out.println("First linked list: "  +linkedlist1);
		
		linkedlist2.add("1");
		linkedlist2.add("2");
		linkedlist2.add("3");
		linkedlist2.add("4");
		
		System.out.println("Second linked list: "  +linkedlist2);
		
		linkedlist3.addAll(linkedlist1);
		linkedlist3.addAll(linkedlist2);
		
		ArrayList<String> arraylist=new ArrayList<>(linkedlist1);
		
		System.out.println(arraylist);
		
		
		
		System.out.println(linkedlist3.contains(linkedlist1));
		
		
		
//		
//		System.out.println("Third linked list: "   +linkedlist3);
//		
//	linkedlist4=	(LinkedList<String>) linkedlist1.clone();
//	
//	System.out.println("Fourth linked list: "  +linkedlist4);
//	
//	
//
//	System.out.println(linkedlist4.contains("Mradul"));
//		
		
		
		

	}

}

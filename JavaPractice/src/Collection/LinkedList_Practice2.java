package Collection;

import java.util.LinkedList;

public class LinkedList_Practice2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedlist=new LinkedList<>();
		
		linkedlist.add(34);
		linkedlist.add(23);
		linkedlist.add(45);
		linkedlist.add(65);
		linkedlist.add(70);
		linkedlist.add(22);
		linkedlist.add(55);
		
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.getLast());
		
//		System.out.println(linkedlist);
//		
//		linkedlist.set(6,10);
//		System.out.println(linkedlist);
//		
//		for(int i=linkedlist.size()-1;i>=0;i--)
//		{
//			System.out.println(linkedlist.get(i));
//		}
//		
		

	}

}

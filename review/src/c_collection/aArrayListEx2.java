package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정
		
		list.set(3, "rat");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
//		System.out.println();
		for(int i = 0; i < list.size(); i++) {
			String data = (String)list.get(i);
			System.out.println(data);
		}
		
//		향상된 for 문
		for (String data :list) {
			 System.out.println(data);
		}
	}
}

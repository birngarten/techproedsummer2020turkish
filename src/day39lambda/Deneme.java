package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class Deneme {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		list.stream().distinct().forEach(System.out::println);
		
		


	}
}

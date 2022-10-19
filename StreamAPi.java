package nik;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPi {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);

		List<Integer> list2 = list.stream().sorted().map(x->x*2).collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
//output: [2, 4, 6, 8, 10]
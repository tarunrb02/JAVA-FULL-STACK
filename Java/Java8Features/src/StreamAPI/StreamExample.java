package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,15,20,25,30,35);
		Stream<Integer> stream = list.stream();
		Stream<Integer> update = stream.map(a->a*2);
		System.out.println(update);
		System.out.println(update.toList());
		
		System.out.println("--------------------------------");
		System.out.println(list.stream().map(a->a+a*0.2).toList());
		
		System.out.println(list.stream().filter(a->a%2==0).toList());
	}
}

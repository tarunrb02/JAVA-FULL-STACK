package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
		
		System.out.println("--------------------------------");
		System.out.println(list.stream().filter(a->a%2==0).toList());
		
		Predicate<Integer> p=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2!=0;
			}
		};
		
		System.out.println("--------------------------------");
		System.out.println(list.stream().filter(p).toList());
		
		/*
		 * forEach() is HOF which accepts the lambda expression of Consumer-type  => forEach(Consumer<T t> c)
		 * where Consumer is @functionalInterface  inside whis void accept(T t) method is present
		 * it will help to fetch each element and write custom logic for each data 
		 */
		
		System.out.println("--------------------------------");
		list.stream().filter(a->a%2==0).forEach(a->{
			System.out.println("Before Hike -> "+a);
			
			System.out.println("After Hike -> "+a*2);
			System.out.println("==================");
		});
		
		/*
		 * min() is HOF which accepts the lambda expression of Comparetor-type  => min(Comparetor<T t, T t> c) returns Optional obj
		 * where Consumer is @functionalInterface  inside which void accept(T t) method is present
		 * it will help to fetch each element and write custom logic for each data 
		 */
		System.out.println(list.stream().min((a,b)->a-b).get());
		System.out.println(list.stream().max((a,b)->a-b).get());
		
		System.out.println(list.stream().collect(Collectors.toSet()));
		
	}
}

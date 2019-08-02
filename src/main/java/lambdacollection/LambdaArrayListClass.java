package lambdacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaArrayListClass {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(25);
		System.out.println(l);
		Collections.sort(l, (i1, i2) -> (i1 < i2 ? -1 : (i1 > i2) ? 1 : 0));
		l.stream().forEach(System.out::println);
		List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
	}

}

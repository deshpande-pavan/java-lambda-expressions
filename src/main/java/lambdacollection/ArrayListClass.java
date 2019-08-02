package lambdacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1 < o2 ? -1 : (o1 > o2) ? 1 : 0); 
		/*
		 * if (o1 < o2) { return -1; } else if (o1 > o2) { return +1; } else { return 0;
		 * }
		 */

	}

}

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(25);
		l.add(5);
		l.add(2);
		System.out.println(l);
		Collections.sort(l, new MyComparator());
		System.out.println(l);
	}
}
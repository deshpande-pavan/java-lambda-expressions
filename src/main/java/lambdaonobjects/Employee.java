package lambdaonobjects;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeDetails {
	String name;
	int eno;

	public EmployeeDetails(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	public String toString() {
		return eno + " " + name;
	}
}

public class Employee {

	public static void main(String[] args) {
		ArrayList<EmployeeDetails> l = new ArrayList<>();
		l.add(new EmployeeDetails("pavan", 22100));
		l.add(new EmployeeDetails("paawan", 2100));
		l.add(new EmployeeDetails("bunny", 3100));
		l.add(new EmployeeDetails("chinni", 1400));
		System.out.println(l);
		Collections.sort(l, (e1, e2) -> (e1.name.compareTo(e2.name)));
		Collections.sort(l,(e1, e2) -> (e1.eno < e2.eno ? -1 : (e1.eno > e2.eno ? 1 : 0)));
		System.out.println(l);
	}

}

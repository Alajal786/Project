package core;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("hibernate");
		set.add("sutherland");
		set.add("absde");
		set.add("500");
		System.out.println(set);
		TreeSet<Employee> empset = new TreeSet<Employee>();
		empset.add(new Employee(302, "reactjs", 7000));
		empset.add(new Employee(101, "sutherland", 4000));
		empset.add(new Employee(102, "james gosling",5000));
		for(Employee emp : empset)
			System.out.println(emp.getCode()+emp.getEmpname());
		
	}

}

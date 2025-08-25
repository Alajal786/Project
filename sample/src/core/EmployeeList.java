package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(101, "sutherland", 5000));
		emplist.add(new Employee(201, "james", 80000));
		emplist.add(new Employee(302, "react js", 9000));
		Predicate<Employee> checkCode = emp-> emp.getCode()==101;
	
		/*Collections.sort(emplist);
		for(Employee emp: emplist)
			System.out.println(emp);
		
		name sorting
	System.out.println();
		Collections.sort(emplist, (emp1, emp2)->{
			return emp1.getEmpname().compareTo(emp2.getEmpname());
			
		});
		for(Employee emp: emplist) {
			System.out.println(emp);
		*/


		

	
	//salary sorting
	/*System.out.println();
	Collections.sort(emplist,(emp1, emp2)->{
		return Double.compare(emp1.getSalary(), emp2.getSalary());
		
	});
	for(Employee epm: emplist)
		System.out.println(epm.getSalary());
		
}*/
		/*Scanner sc = new Scanner(System.in);
		List<Employee> Salarywise = emplist.stream()
				                  .filter((emp)->emp.getSalary()>7000)
				                   .map((e)->e)
				                   .collect(Collectors.toList());
				
		//Salarywise.forEach((e)->System.out.println(e));
		/*Optional<Employee> emp1 = emplist.stream()
				.filter((emp)->emp.getCode()==201)
				.map(employee->employee)
				.findFirst();
				
		Optional<Employee> emp1 = emplist.stream().filter((emp)->emp.getCode()==56).map(employee).findFirst();*/
		
			/*try {
				System.out.println("enter employee");
				int intNumber = sc.nextInt();
				System.out.println("you enter number:" + intNumber);
				
				Optional<Employee> emp2 = emplist.stream().filter((emp)->emp.getCode()==intNumber).map(employee).findFirst();
				if(emp2.isEmpty()) {
				 throw new Exception("Employee with code 201 is not found ");
				System.outprintln(emp2);
			}
				catch(Exception e) {
				System.out.println(e.getMessage());
				
			}
			
			
			
			/*System.out.println("employee details not found");
		else {
			System.out.println(emp1.get());

	}*/
		try {
			Employee emp = emplist.stream()
                        .filter(checkCode)	
                        .map(e->e).findFirst()
                        .orElseThrow(()->new EmployeeNotfOundException());
			System.out.println(emp);
			
                        }
		catch(EmployeeNotfOundException e) {
			System.out.println(e.getMessage());
		}
	
	
	}
}

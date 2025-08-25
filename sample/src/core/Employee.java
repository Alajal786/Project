package core;

public class Employee implements Comparable<Employee> {
	private int code;
	private String empname;
	private double salary;
	public Employee() {
		
	}
	public Employee(int code, String empname, double salary) {
		super();
		this.code = code;
		this.empname = empname;
		this.salary = salary;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


   @Override
public int compareTo(Employee emp) {
	int diff = this.code-emp.getCode();
	return diff;


   }
 
   
   }




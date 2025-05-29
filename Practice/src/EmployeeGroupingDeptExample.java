import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employeee {
	private String name;
	private String department;
	private double salary;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	public Employeee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Constructor, Getters, Setters, toString()

}

public class EmployeeGroupingDeptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employeee> employees = Arrays.asList(new Employeee("Alice", "HR", 50000), new Employeee("Bob", "IT", 70000),
				new Employeee("Charlie", "HR", 60000), new Employeee("David", "IT", 80000),
				new Employeee("Eve", "Sales", 55000));

		employees.stream().sorted(Comparator.comparingDouble(Employeee::getSalary).reversed())
				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.toList()))
				.forEach((dept, emp) -> System.out.println(dept + ":" + emp));
	}

}

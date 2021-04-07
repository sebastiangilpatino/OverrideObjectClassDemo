package Lab7;

import java.util.Objects;

/**
 * @author sebastiangil
 *
 */
public class Position implements Cloneable {
	private String title;
	private String description;
	private Employee employee;

	public Position(String title, String description, Employee employee) {
		super();
		this.title = title;
		this.description = description;
		this.employee = employee;
	}

	public void addEmployee(Employee emp) {
		employee = emp;
	}

	public void print() {
		System.out.println("");
		System.out.print("  " + title + ": ");

		if (employee != null) {
			employee.print();
		}

		System.out.println("");
	}

	public String getTitle() {
		return title;
	}

	public double getSalary() {
		double sal = 0;

		if (employee != null) {
			sal += employee.getSalary();
		}

		return sal;
	}

	@Override
	public String toString() {
		return "Position [title=" + title + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, employee, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Position other = (Position) obj;
		return Objects.equals(description, other.description) && Objects.equals(employee, other.employee)
				&& Objects.equals(title, other.title);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Position copy = (Position) super.clone();
		copy.employee = (Employee) employee.clone();
		return copy;
	}

}
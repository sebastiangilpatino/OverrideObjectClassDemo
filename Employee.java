package Lab7;

import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * @author sebastiangil
 *
 */
public class Employee implements Cloneable {
	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private GregorianCalendar birthDate;
	private String SSN;
	private double salary;

	public Employee(int employeeId, String firstName, String middleInitial, String lastName,
			GregorianCalendar birthDate, String sSN, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		SSN = sSN;
		this.salary = salary;
	}

	public void print() {
		System.out.println("");
		System.out.print("   " + firstName + " ");
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(SSN, birthDate, employeeId, firstName, lastName, middleInitial, salary);
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
		Employee other = (Employee) obj;
		return Objects.equals(SSN, other.SSN) && Objects.equals(birthDate, other.birthDate)
				&& employeeId == other.employeeId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(middleInitial, other.middleInitial)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee copy = (Employee) super.clone();
		copy.birthDate = (GregorianCalendar) birthDate.clone();
		return copy;
	}

}

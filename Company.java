package Lab7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Company implements Cloneable {
	List<Department> departments;
	private String name;

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public Company(String name) {
		departments = new ArrayList<Department>();
		this.name = name;
	}

	public void print() {
		System.out.println(name + ": ");
		for (int i = 0; i < departments.size(); i++) {
			departments.get(i).print();
		}
	}

	public void addDepartment(Department dept) {
		departments.add(dept);
	}

	public double getSalary() {
		double sal = 0;

		for (int i = 0; i < departments.size(); i++) {
			sal += departments.get(i).getSalary();
		}

		return sal;

	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departments, name);
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
		Company other = (Company) obj;
		return Objects.equals(departments, other.departments) && Objects.equals(name, other.name);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Company copy = (Company) super.clone();
		copy.departments.clear();

		// copying collection of Position
		copy.departments.clear();
		Iterator<Department> it = departments.iterator();
		while (it.hasNext()) {
			copy.departments.add((Department) it.next().clone());
		}
		return copy;
	}

}

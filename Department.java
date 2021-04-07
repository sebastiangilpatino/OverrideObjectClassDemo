package Lab7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Department implements Cloneable {
	private String name;
	private String location;
	private List<Position> positions;

	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		this.positions = new ArrayList<Position>();
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("");
		System.out.print(" " + name + ": ");

		for (int i = 0; i < positions.size(); i++) {
			positions.get(i).print();
		}

	}

	public void addPosition(Position pos) {
		positions.add(pos);
	}

	public double getSalary() {
		double sal = 0;

		for (int i = 0; i < positions.size(); i++) {
			sal += positions.get(i).getSalary();
		}

		return sal;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, name, positions);
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
		Department other = (Department) obj;
		return Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(positions, other.positions);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Department copy = (Department) super.clone();

		// copying collection of Position
		copy.positions.clear();
		Iterator<Position> it = positions.iterator();
		while (it.hasNext()) {
			copy.positions.add((Position) it.next().clone());
		}

		return copy;
	}

}

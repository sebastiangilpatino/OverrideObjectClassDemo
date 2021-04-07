package Lab7;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		GregorianCalendar date = new GregorianCalendar(1987, 9, 14);

		Employee emp1 = new Employee(123, "Jose", "Gabriel", "Smith", date, "123-23-456", 90000);
		Employee emp1A = (Employee) emp1.clone();
		Employee emp2 = new Employee(123, "Milton", "Frey", "Gonzalez", date, "111-22-333", 70000);
		Employee emp3 = new Employee(123, "Arcano", "Emad", "Xing", date, "222-33-444", 80000);

		Company companyX = new Company("X");

		Department departmentA = new Department("department A", "Fairfield");
		Department departmentA1 = new Department("department A", "Fairfield");
		Department departmentB = new Department("department B", "Seattle");

		Position marketingA = new Position("Marketing A", "work a lot", emp1A);
		Position salesA = new Position("Sales A", "work a lot", emp3);
		Position managerA = new Position("Management A", "work a lot", emp2);

		Position marketingB = new Position("Marketing B", "work a lot", emp1);
		Position marketingB1 = (Position) marketingB.clone();
		Position managerB = new Position("Management B", "work a lot", emp2);
		Position salesB = new Position("Sales B", "work a lot", emp3);

		companyX.addDepartment(departmentA);
		companyX.addDepartment(departmentB);

		departmentA.addPosition(marketingA);
		departmentA.addPosition(salesA);
		departmentA.addPosition(managerA);

		departmentB.addPosition(marketingB);
		departmentB.addPosition(salesB);
		departmentB.addPosition(managerB);

		managerB.addEmployee(emp1);
		managerA.addEmployee(emp2);
		salesA.addEmployee(emp3);

		// companyX.print();
		// System.out.println("\nTotal salaries of employees are: " +
		// companyX.getSalary());

		/////////////// Equals Employee///////////////////////////
		System.out.println(emp1.toString());
		System.out.println(emp1.hashCode());
		System.out.print(" equals: ");
		System.out.println(emp1.equals(emp1A));
		System.out.println(emp1A.toString());
		System.out.println(emp1A.hashCode());
		/////////////////////////////////////////
		System.out.println("");
		////////////////////////////////////////
		System.out.println(emp1.toString());
		System.out.println(emp1.hashCode());
		System.out.print(" equals: ");
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.toString());
		System.out.println(emp2.hashCode());
		/////////////////////////////////////////
		System.out.println("");
		/////////////// Equals Position///////////////////////////
		System.out.println(marketingB.toString());
		System.out.println(marketingB.hashCode());
		System.out.print(" equals: ");
		System.out.println(marketingB.equals(marketingB1));
		System.out.println(marketingB1.toString());
		System.out.println(marketingB1.hashCode());
		/////////////////////////////////////////
		System.out.println("");
		////////////////////////////////////////
		System.out.println(marketingB1.toString());
		System.out.println(marketingB1.hashCode());
		System.out.print(" equals: ");
		System.out.println(marketingB1.equals(salesA));
		System.out.println(salesA.toString());
		System.out.println(salesA.hashCode());
		/////////////////////////////////////////
		System.out.println("");
		/////////////// Equals Department///////////////////////////
		System.out.println(departmentA.toString());
		System.out.println(departmentA.hashCode());
		System.out.print(" equals: ");
		System.out.println(departmentA.equals(departmentA1));
		System.out.println(departmentA1.toString());
		System.out.println(departmentA1.hashCode());
		/////////////////////////////////////////
		System.out.println("");
		////////////////////////////////////////
		System.out.println(departmentA.toString());
		System.out.println(departmentA.hashCode());
		System.out.print(" equals: ");
		System.out.println(departmentA.equals(departmentB));
		System.out.println(departmentB.toString());
		System.out.println(departmentB.hashCode());
		////////////////////////////////////////
	}

}

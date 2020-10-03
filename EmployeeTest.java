import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		
		String response;
		int id = 0;
		
		Employee x = new Employee();
		
		System.out.print("Enter name: ");
		response = y.nextLine();
		x.setName(response);
		System.out.print("Enter department: ");
		response = y.nextLine();
		x.setDepartment(response);
		System.out.print("Enter position: ");
		response = y.nextLine();
		x.setPosition(response);
		System.out.print("Enter ID: ");
		id = y.nextInt();
		x.setIdNumber(id);
		
		System.out.println("\n\nName: " + x.getName());
		System.out.println("ID: " + x.getIdNumber());
		System.out.println("Department: " + x.getDepartment());
		System.out.println("Position: " + x.getPosition());
		
		y.close();
	}

}

/**
 * This program allows the user to store
 * the employee's name, id number, department
 * and position
 * @author jgyal
 *
 */
public class Employee {

	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	public Employee(String n, String dept, String pos, int id){
		name = n;
		idNumber = id;
		department = dept;
		position = pos;
	}
	
	public Employee(String n, int id) {
		name = n;
		idNumber = id;
		department = "";
		position = "";
	}
	
	/**
	 * @param n the name
	 */
	
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * @param num the ID number
	 */
	
	public void setIdNumber(int num) {
		idNumber = num;
	}
	
	/**
	 * @param d the department
	 */
	
	public void setDepartment(String d) {
		department = d;
	}
	
	/**
	 * @param p the position
	 */
	
	public void setPosition(String p) {
		position = p;
	}
	
	/**
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * @return the idNumber
	 */
	
	public int getIdNumber() {
		return idNumber;
	}
	
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * @return the position
	 */
	
	public String getPosition() {
		return position;
	}
	
}

package Encapsulation;

class Employee{
	private String empname="Prajwal";
	private int empId=102;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
} 
public class EmployeeDetails {	
	String name ="Sachin";
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setEmpId(101);
		obj.setEmpname("Prajwal");
		System.out.println(obj.getEmpId());
		System.out.println(obj.getEmpname());
	}
}

import java.io.*;
class Employee{
	String name ;
	int empID;
	Employee(String str,int num){
		name = str;
		empID = num;
	}
	static String projectName = "Weather APP";
	void printEmpDetail(){
		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + empID);
	}

}
class EmployeeRecord{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee emp1 = new Employee("Ganesh",1);
		System.out.println("Enter Employee Name :");
		String name = br.readLine();
		System.out.println("Enter Employee ID :");
		int id = Integer.parseInt(br.readLine());
		
		Employee emp2 = new Employee(name,id);
		emp1.printEmpDetail();
		System.out.println("EMPLOYEE RECORDS(emp2)");
		emp2.printEmpDetail();
		

	}
}

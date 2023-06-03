class MainDemo{
	public static void main(String args[]){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.empInfo();
		emp2.empInfo();

		System.out.println("=========");

		emp2.empID = 20;
		emp2.name = "Rahul";
		emp2.y = 5000;

		emp1.empInfo();
		emp2.empInfo();
	}

}
class Employee{
	int empID = 10;
	String name = "Kanha";

	static int y =50;

	void empInfo(){
		System.out.println("ID = " + empID);
		System.out.println("Name = " + name);
		System.out.println("y = " + y);
	}
		
}

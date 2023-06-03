
//

class BankStaff{
	static String branchAddress = "Narhe,Pune";
	String empName = "Tushar Varal";
	int salary = 20000;

	void printInfo(){
		System.out.println("Name : "+ empName);
		System.out.println("Salary : " + salary);
		System.out.println("Branch Address : " + branchAddress);
		System.out.println("--------------------------------------");
	}

}

class Main{
	public static void main(String[] args){
		BankStaff obj = new BankStaff();
		BankStaff obj2 = new BankStaff();
		System.out.println("First Staff member(obj1)");
		obj.printInfo();
		System.out.println("obj2");
		obj2.printInfo();
		System.out.println("Second Staff Member");
		obj2.empName = "Ganesh Nitalikar";
		obj2.salary = 100000000;
		obj2.branchAddress = "
		obj2.printInfo();
	}
}

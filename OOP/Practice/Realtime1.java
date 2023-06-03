class User{
	User(){
		//System.out.println(this);
		System.out.println("In User Constructor");

	}
	String userName = "username";
	String email = "mail@gmail.com";

	void login(){
		System.out.println("Login Method");
	}

}

class Customer extends User{
	Customer(){
		//System.out.println(this);
		System.out.println("In Customer Constructor");
	}
	int custId = 1;
	String custName = "Name";
	String address = "Address";

	void updateProfile(){
		System.out.println("Update Profile");
	}

	void addToCart(){
		System.out.println("Add To Cart Method");
	}
}

class Client{
	public static void main(String args[]){
		
		Customer obj = new Customer();
		obj.login();
		System.out.println(obj.userName);	
		//System.out.println(obj);
	}
}

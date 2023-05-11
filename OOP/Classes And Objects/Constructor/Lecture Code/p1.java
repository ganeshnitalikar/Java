/*
Global nonstatic variables which are declared in class but outside any method are stored inside the constructor 
Instance variables are declared globally but they do not get memory before creation object
Constructors reside inside Object of class,
hence for calling or using nonstatic variables we need to create object of class first 

object of class contains constructor ,, constructor contains non-static global variables (instance variables) 

for static variables separate area is used  which is called as static block
static block has high priority, and variables inside static block are initialized without creating any object 
hence we can use static varibles without object of class

*/

class Program {
	int y = 10;

	static void func(){
		int z  = 30;
	}
	public static void main(String args[]){
		int x = 20;
	}
}

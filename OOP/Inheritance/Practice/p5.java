//Parent obj = new Child() 
//this obj cannot access the child class's methods and variables even though it is child's object
//same thing happen is case of super 
//at compile time super is converted into parent's referece (Parent obj  = child obj);
//here 'this' parameter remains same even after typecasting but when a method is accesed by parent's reference jvm finds that method in parent class only
//but when same method is accesed by using child's reference it finds that method in both parent and child class 
class Parent{
	int x = 10;
	static int y =20;
	void method(){
		System.out.println(this);     //child@obj1
	}
}
class Child extends Parent{
	int x = 30;
	static int y = 40;
	void access(){
		System.out.println(super.x);         //10
		System.out.println(((Parent)this).x);  //10
 
		System.out.println(((Parent)this));     //child@obj

	}
	public static void main(String[] args){
		Child obj = new Child();
		obj.access();
	System.out.println(obj);	
		Parent obj1 = new Child();
	System.out.println(obj1);	
		obj1.method();
		obj1.access(); //error cannot find symbol

	}
}
class Client {
	public static void main(String[] args){
		Parent obj = new Child();
		obj.access(); //error cannot find symbol
	}
}

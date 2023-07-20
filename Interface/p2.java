interface A{
	int x = 20;
	void fun();
}
class  B implements A{
	
	public void fun(){
		System.out.println("In fun");
	}
}
class Client{
	public static void main(String[] args){
		B obj = new B();
		obj.fun();
		System.out.println(obj.x);
	}
}

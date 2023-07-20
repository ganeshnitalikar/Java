interface A{
	void fun();
}
interface B{
	void fun();
}
class Child implements A,B{
	public void fun(){
		System.out.println("In Child FUn");
	}
}
class Client{
	public static void main(String[] args){
		A obj = new Child();
		obj.fun();
	}
}

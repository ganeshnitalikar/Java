interface Demo{
	void fun();
	void gun();
}
class A implements Demo{
	public void fun(){
		System.out.println("In FuN");
	}
	public void gun(){
		System.out.println("In Gun");
	}
}
class B extends A{
	public static void main(String[] args){
		Demo obj = new A();
		obj.fun();
		obj.gun();
	}
}

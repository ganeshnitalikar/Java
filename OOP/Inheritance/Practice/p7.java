class Parent{

}
class Child extends Parent{

}
class Client{
	public static void main(String[] args){
		Parent obj = new Child();
		System.out.println(obj);
	}
}

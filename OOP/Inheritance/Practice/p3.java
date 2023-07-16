class Parent{

	int x = 10;
	static int y =20 ;

}
class Child extends Parent{
	int x = 30;
	int y = 40;	
	void display(){
		System.out.println(super.x);
		System.out.println(super.y);
	}
}
class Client{
	static int x = 20;
	public static void main(String args[]){
		//Client obj = new Client();
		//System.out.println(obj.x);
		Child obj = new Child();
		obj.display();

	}
}

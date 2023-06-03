class GrandParent{
	GrandParent(){
		System.out.println("IN GRANDPARENT CONSTRUCTOR");
	}
}
class Parent{

	Parent(){
		super();
		System.out.println("IN PARENT CONSTRUCTOR");
	}
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("IN Child  CONSTRUCTOR");
	}
	public static void main(String args[]){
		Parent obj = new Child();
	}
}


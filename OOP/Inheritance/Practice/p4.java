//why super can't be used in static method ?
//=> because super is nothing but this reference typecasted into parent type and we know that this reference is not valid in static methods




class Parent{
	int x = 10;
	static int y =20 ;

}

class Child extends Parent{
	int x = 30;
	static int y =40;
	void display(){

		System.out.println(x);
		System.out.println(((Parent)this).x); //Internally super keyword typecasts the Child obj into parent obj. and by using this reference we can access all non static(instance) variables of parent class 
	//if we remove int x from parent, this line throws error "symbol not found"					   

		System.out.println(super.x);

		System.out.println(super.y);  
		//this reference of obj => ptr to special structure (child)=>ptr to parent's special str => ptr to parent's static block 
	}
	
	public static void main(String args[]){
		Child obj = new Child();
		obj.display();
	}

}



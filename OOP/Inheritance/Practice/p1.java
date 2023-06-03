class Parent {
	void method(){
		Parent obj = new Parent();
		System.out.println("IN Method");
	//	obj.method(); also give stack overflow error
	}
	Parent(){
		//Parent obj = new Parent(); gives stack overflow error
	}
	public static void main(String args[]){
		Parent obj1 = new Parent();
		obj1.method();
	}
}

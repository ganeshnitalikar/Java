class Outer {
	class Inner{
		void m1(){
			System.out.println(this);
		}
	}
	void m1(){
		System.out.println(this);
	}
	public static void main(String[] args){
		Outer.Inner obj = new Outer().new Inner();
		obj.m1();
		new Outer().m1();
	}
}

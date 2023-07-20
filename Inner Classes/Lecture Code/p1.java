class Outer{

	class Inner {
		void m1(){
			System.out.println("In Inner M1");
		}
	}
	void m1(){
			
			System.out.println("In Outer M1");
	}


}	
class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		obj.m1();

		Outer.Inner obj1 = new Outer().new Inner();
		obj1.m1();

	}
}

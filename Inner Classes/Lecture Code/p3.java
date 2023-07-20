//static inner class

class Outer{
	void m1(){
		System.out.println("In Outer M1");
	}
	static class Inner{
		void m1(){
			System.out.println("In Inner M1");
		}
	}
	public static void main(String[] args){
		Inner obj = new Inner();
		obj.m1();
		
	}

}
class Client{
	public static void main(String[] args){
		Outer.Inner obj = new Outer.Inner();
		obj.m1();
	}
}

//method local inner class

class Outer{
	
	void m1(){
		
		System.out.println("In Outer M1");
		class Inner {
			void m1(){
				System.out.println("In Inner M1");
			}
		
		}
		Inner obj = new Inner();
		obj.m1();
	}
	public static void main(String[] args){
		Outer obj = new Outer();
		obj.m1();

	}
}

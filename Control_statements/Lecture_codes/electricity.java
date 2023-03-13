//given an integer input a which represents units of electricity consumer of house
//calculate and print bill amount
//units <=100  price ==1
//units > 100 price ==2

class ElectricityBillProblem{
	public static void main(String args[]){
		int unit = 120;

		if(unit<=100){
			System.out.println("Bill : " + unit);
		}else{
			int bill =  (unit-100)*2+100; 
			System.out.println("Bill : " + bill);
		}
	}

}


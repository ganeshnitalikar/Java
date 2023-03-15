
//Print month name with days when month number is given 
//eg x = 1 o/p ==== January has 31 days

class Month{
	public static void main(String args[]){
		int x =2;
		if(x==1){
			System.out.println("January Has 31 days");
		}else if(x==2){
			System.out.println("February Has 28/29 days");
		}else if(x==3){
			System.out.println("March has 31 days");
		}else if(x==4){
			System.out.println("April Has 30 days");
		}else if(x==5){
			System.out.println("May Has 31 days");
		}else if(x==6){
			System.out.println("June Has 30 days");
		}else if(x==7){
			System.out.println("July Has 31 days");
		}else if(x==8){
			System.out.println("August Has 31 days");
		}else if(x==9){
			System.out.println("September Has 30 days");
		}else if(x==10){
			System.out.println("Octomber Has 31 days");
		}else if(x==11){
			System.out.println("November Has 30 days");
		}else if(x==12){
			System.out.println("December Has 31 days");
		}else{
			System.out.println("Invalid Month Number");
		}
	}
}

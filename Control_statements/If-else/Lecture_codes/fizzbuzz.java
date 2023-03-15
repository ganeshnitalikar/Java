//GIVEN AN INTEGER VALUE AS INPUT 
//PRINT BUZZ IF IT IS DIVISIBLE BY 5
//PRINT FIZZ IF IT IS DIVISIBLE BY 3
//PRINT FIZZ-BUZZ IF IT IS DIVISIBLE BY BOTH
//PRINT NOT DIVISIBLE BY BOTH IF NOT 

class FizzBuzz{
	public static void main(String args[]){
		int x = 15;

		if(x%3==0 && x%5==0){
			System.out.println("Fizz-Buzz");
		}else if(x%3==0){
			System.out.println("Fizz");
		}
		else if(x%5==0){
			System.out.println("Buzz");
		}else{
			System.out.println("Not Divisible By Both");
		}
	}
}

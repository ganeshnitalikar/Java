//Print countdown of days to submit the assignment
//n = 6
//6 days remaining 
//5 dats remaining
//
 class Program8{
	 public static void main(String ganesh[]){
		 int N= 5;

		 while(N>=1){
			 System.out.println(N-1 + " " + "Days Remaining ");
			 N--;
		 }
		 if(N==0){
			 System.out.println("0 days Assignment Overdue");
	}else{
		System.out.println("Invalid Input");
	}
	 }
 }

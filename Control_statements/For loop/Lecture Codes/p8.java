//armstrong number 
//
class Program8{
	public static void main(String ganesh[]){
		int N=153;
		int count = 0;
		int temp = N;
		int rem ;
		int sum = 0 ;
		for(;N!=0;N=N/10){
			count++;
		}
		N = temp;

		for(;N!=0;N = N/10){
			int multi = 1;
			rem = N%10;
			for(int i=1;i<=count;i++){
				multi = multi*rem;
			
			}
		sum = sum + multi;	
		}
		if(sum==temp){
			System.out.println("It is a Armstrong Number");
		}else{
			System.out.println("Not Armstrong Number");
		}
	}
}


		

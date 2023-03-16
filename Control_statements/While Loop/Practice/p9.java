//Reverse a number 
//
class Program9{
	public static void main(String ganesh[]){
		int N =2342355;
		int temp,rev=0;
		while(N!=0){
			temp = N%10;
			rev = rev*10+temp;
			N = N/10;
		
		}
		System.out.println(rev);
	}
}


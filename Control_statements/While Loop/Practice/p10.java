//Palindrome number

class Program10{
	public static void main(String ganesh[]){
		int N = 1221;
		int temp,a=N,rev =0;
		while(N!=0){
			temp = N%10;
			rev = rev*10 + temp;
			N = N/10;
		}
		if(a==rev){
			System.out.println("It is Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
}

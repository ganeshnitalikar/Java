//Given integer N print sum of its digits assume n>=0 
//6531
//15
 
class Program6{
	public static void main(String ganesh[]){
		int N = 6531;
		int sum = 0;

		while(N!=0){
			int temp = N%10;
			sum = sum + temp ;
			N = N/10;
		}
		System.out.println("Sum : " + 15);
	}
}

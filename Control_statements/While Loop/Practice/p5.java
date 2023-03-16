//Even digits of no.

class Program5{
	public static void main(String ganesh[]){
		int N = 1234;
		int temp;

		while(N!=0){
			temp = N%10;
			if(temp%2==0){
				System.out.println(temp);
			}
			N = N/10;
		}
	}
}

//print odd digits of given no

class Program4{
	public static void main(String ganesh[]){
		int N = 942111423;
		int temp ;

		while(N!=0){
			temp = N%10;
			if(temp%2==1){
				System.out.println(temp);
			}
			N = N/10;
		}
	}
}

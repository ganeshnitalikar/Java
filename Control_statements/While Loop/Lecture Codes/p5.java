//Given an integer N print all its digits 
//6531
//1
//3
//5
//6

class Program5{
	public static void main(String ganesh[]){
		int N = 6531;
		while(N!=0){
			System.out.println(N%10);
			N = N/10;
		}
	}
}

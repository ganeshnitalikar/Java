//Take n input and print all factors 
//x is factor of n if n%x==0
//
class Program4{
	public static void main(String ganesh[]){
		int N = 6;
		for(int i = 1; i<=N; i++){
			if(N%i==0){
				System.out.println(i);
			}
		}
	}
}

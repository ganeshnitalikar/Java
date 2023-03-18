// Perfect number

class Program7{
	public static void main(String ganesh[]){
		int N=6;
		int sum =0 ;
		for( int i=1;i<N;i++){
			if(N%i==0){
				sum = sum + i;
			}
		}
		if(sum==N){
			System.out.println("Perfect Number");
		}else{
			System.out.println("Not Perfect Number");
		}
	}
}


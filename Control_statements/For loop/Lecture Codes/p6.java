//Take n as input and print whether its prime or not


class Program6{
	public static void main(String ganesh[]){
		int N =5;
		int i;
		int count = 0;
		for(i=1; i<=N;i++){
			if(N%i==0){
				count++;
				}
		
		}
		if(count==2){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	}
}

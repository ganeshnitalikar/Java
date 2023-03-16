//Sum of even no and multiplication of odd number between 1 to 10;

class Program6{
	public static void main(String ganesh[]){
		int sum=0,multi=1;
		int i=1;
		
		while(i<=10){
			if(i%2==0){
				sum = sum + i;
			}else{
				multi = multi*i;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println(multi);

	}
}


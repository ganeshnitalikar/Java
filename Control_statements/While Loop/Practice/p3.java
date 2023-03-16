//Program to cound digits of number 
//942111423
//9

class Program3{
	public static void main(String ganesh[]){
		int N = 942111423,count = 0;
		int temp;
		while(N!=0){
			count++;
			N = N/10;
		}
		System.out.println(count);
	}
}



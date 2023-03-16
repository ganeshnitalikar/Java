//if even no print in reverse order
//if odd no print in reverse order with diff of 2
//6 ==== 654321
//5 ==== 5 3 1
//
 
class Program7{
	public static void main(String  ganesh[]){
		int N =9;

		if(N%2==0){
			while(N>=1){
				System.out.println(N);
				N--;
			}
		}else{
			while(N>=1){
				System.out.println(N);
				N = N-2;
			}
		}
		
	}
}

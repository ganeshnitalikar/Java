//take n as input and count its factors
// n= 6
class Program5{
	public static void main(String ganesh[]){
		int N=6,count=0;
		for(int i = 1; i<=N ; i++){
			if(N%i==0){
				count++;
			}
		}
		System.out.println("Count Of Factors : " + count);
	}
}

//
//
//
//
//
//
//
//
class Program7{
	public static void main(String ganesh[]){
		int N = 6;
		for(int i = 1 ; i<=6; i++){
			int n = 64+N-i+1;
			char ch =  (char)n;
			for(int j = 1 ; j<=i ; j++){
				//char ch = (char)n;
				System.out.print(ch++ + " " );
			}System.out.println();
			

		}
	}
}

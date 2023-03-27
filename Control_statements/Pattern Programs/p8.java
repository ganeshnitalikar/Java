///
//
//
//
//
//
class Program8{
	public static void main(String ganesh[]){
		int N = 4;		
		for(int i = 1; i <= N ;i++){
			int n = 64+N*3-1-i;
			char ch = (char)n;
			for(int j = 1; j<=i ; j++){
				System.out.print(ch-- + " ");
			}
			System.out.println();
		}
	}
}

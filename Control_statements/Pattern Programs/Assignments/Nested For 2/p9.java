//
//
//
//
//
//
class Program9{
	public static void main(String ganesh[]){
		int num = 1;
		for(int i = 1 ;i<=4; i++){
			char ch = 'C';
			int n = 3;
			for(int j= 1; j<=3; j++){
				System.out.print(num*num);
				num++;
				System.out.print(ch--);
				System.out.print(n-- + " ");
			}System.out.println();
		}
	}
}


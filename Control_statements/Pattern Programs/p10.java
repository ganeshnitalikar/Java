//
//
//
//
//
//

class Program10{
	public static void main(String ganesh[]){

		int row = 4;
		int num = 1;
		for(int i = 1; i<=row; i++){

			for(int j = 1 ; j<=row-i+1; j++){
				System.out.print(num + " ");
				num ++;
			}System.out.println();
		}
	}
}


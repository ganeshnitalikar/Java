// 
//
//
//
//

class Program7{
	public static void main(String ganesh[]){
		int num = 1;

		for(int i = 1; i<=3; i++){
			for(int j = 1 ; j<=3; j++){
				if(j%2==0){
				System.out.print(num + " ");
				num++;
				}else{
					System.out.print(num*num);
					num++;
				}
			}System.out.println();
			}
	}
}


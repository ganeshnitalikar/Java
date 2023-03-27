//
//
//
//
//
//
class Program10{
	public static void main(String ganesh[]){
		for(int i = 1 ; i<=4; i++){
				int num =6 ;
				char ch = 'F';
			for(int j = 1 ; j<=6; j++){
				if(j%2==1){
					
					System.out.print(ch-- + " " );
					if(j!=2){

					num--;}
				}else{
					System.out.print(num-- + " " );
					ch--;
				}
			}
			System.out.println();
		}
	}
}


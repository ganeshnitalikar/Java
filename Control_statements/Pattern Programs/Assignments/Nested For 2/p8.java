//
//
//
//
//
//

class Program8{
	public static void main(String ganesh[]){
		char ch = 'A';
		char cha = 'a';

		for(int i = 1; i<=4; i++){
			for(int j = 1 ; j<=4; j++){
				if(j%2==1){
					
					System.out.print(ch++ + " ");
					ch++;
						cha++;
				}else 
				{
					System.out.print(cha++ + " ");
					ch++;
					cha++;
				}
			}System.out.println();
		}
	}
}


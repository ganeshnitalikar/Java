/*
# = = = =
= # = = =
= = # = =
= = = # =
= = = = #
*/
import java.io.*;
class Program{

	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Rows: ");
		int rows=Integer.parseInt(br.readLine());
		int num=rows;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i==j){
					System.out.print("# ");
				}else{
					System.out.print("= ");
				}
			}
			System.out.println();
		}
	}
}

/*
write a program to print the following pattern
D4 C3 B2 A1
A1 B2 C3 D4
D4 C3 B2 A1
A1 B2 C3 D4

USE THIS FOR LOOP STRICTLY for the outer loop
Int row;
Take the number of rows from user
for(int i =1;i<=row;i++){
}
*/
import java.io.*;
class Program1{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Rows: ");
		int rows=Integer.parseInt(br.readLine());
		int num=rows;
		int ch=rows+64;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2==1){
					System.out.print((char)ch-- +"" + num-- + " ");

				}else{
					System.out.print((char)ch++ +"" + num++ + " ");
				}
			}
			if(i%2==1){
				num++;
				ch++;
			}else{
				num--;
				ch--;
			}
		System.out.println();
		}
	}
}

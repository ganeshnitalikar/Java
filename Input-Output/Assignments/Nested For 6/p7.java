/*
Write a program to take range as input from the user and print the reverse of all numbers. ( Take a
start and end number from a user )
Input: Enter start: 100
Enter end: 200
*/
import java.io.*;
class Program7{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		int N = Integer.parseInt(br.readLine());
		int temp,rev=0;
		while(N!=0){
			temp = N%10;
			rev = rev*10+temp;
			N = N/10;
		
		}
		System.out.println(rev);
	}
}

/*
Write a program to take 5 numbers as input from the user and print the count of digits in those
numbers.
Input: Enter 5 numbers :
5
The digit count in 5 is 1
25
The digit count in 25 is 2
225
The digit count in 225 is 3
6548
The digit count in 6548 is 4
852347
The digit count in 852347 is 6	
 */
import java.io.*;
class Program6{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 Numbers");
		int count = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<count; i++){
			System.out.println("Enter Number : ");
			int num  = Integer.parseInt(br.readLine());
			int n = num;
			int digit =0 ;
			while(n!=0){
				digit++;
				n = n/10;
			}

			System.out.println("The Digit count in " + num + " is " + digit);
		}
	}
}


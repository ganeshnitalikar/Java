/*
WAP to reverse each element in an array.
Take size and elements from the user
Input: 10 25 252 36 564
Output: 01 52 252 63 465
*/

import java.io.*;
class Program2{
	static void reverseNum(int n){
		int temp = n;
		int rev = 0;
		
		

		while(temp!=0){
			int a = temp%10;
			rev = rev*10 + a;
			temp = temp/10;
			System.out.print(rev);

		}
		
	}
	public static void main(String ganesh[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Program2 obj = new Program2();
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter  Elements: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0 ; i<arr.length; i++){
			System.out.print("Reverse Of " + i + " index No is : " );
			reverseNum(arr[i]);
			 
			System.out.println();
		}



	}
}

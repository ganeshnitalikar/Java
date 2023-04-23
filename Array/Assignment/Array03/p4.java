/*
WAP to find a prime number from an array and return its index.
Take size and elements from the user
Input: 10 25 36 566 34 53 50 100
Output: prime no 53 found at index: 5
*/

import java.io.*;
class Program{

	static void primeNum(int n){
		int temp = n;
		int count=0;
		for(int i= 1; i<=temp; i++){
			if(temp%i==0){
			count++;
			}
			
			
		}
		if(count==2){
			System.out.println(n);
		}
			
	}


	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Elements : " );

		for(int i = 0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Prime Number In Entered Array :");

		for(int i = 0; i<arr.length; i++){
			primeNum(arr[i]);		
		}


	}
}

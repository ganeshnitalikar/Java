/* 
WAP to find a composite number from an array and return its index.
Take size and elements from the user
Input: 1 2 3 5 6 7
Output: composite 6 found at index: 4
*/

import java.io.*;
class Program3{

	static void compositeNum(int n){
		int temp = n;
		int count=0;
		for(int i= 1; i<=temp; i++){
			if(temp%i==0){
			count++;
			}
			
			
		}
		if(count>2){
			System.out.println(n);
		}
			
	}


	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Elements : " );

		for(int i = 0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Composite Number In Entered Array :");

		for(int i = 0; i<arr.length; i++){
			compositeNum(arr[i]);		
		}


	}
}

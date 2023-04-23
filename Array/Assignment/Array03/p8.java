/*
 WAP to find an ArmStong number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 153 55 89
Output: Armstrong no 153 found at index: 4
 */

import java.io.*;
class Program8{
	static boolean armstrongNum(int n){
		int temp =n;
		int sum = 0;
		int count =0 ;
		while(temp!=0){
			count++;
			temp  = temp/10;
		}
		temp = n;
		while(temp!=0){
			int multi = 1;
			int a = temp%10;
			for(int i=1; i<=count; i++){
			 multi= multi*a;
			}
			sum = sum + multi;
			temp= temp/10;
		
		}

		if(sum==n){
			return true;
		}	
		else{
			return false;
		}
	}


	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());
		int arr1[] = new int[size];


		System.out.println("Enter Elements : ");
		for(int i = 0; i<arr1.length; i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}


		System.out.print("Armstrong Number Found At: ");
		for(int i = 0 ; i<arr1.length; i++){
			if(armstrongNum(arr1[i])==true){
				System.out.println(i);
			}


		}
	}
}




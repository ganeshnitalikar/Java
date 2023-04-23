/*
WAP to find a Strong number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 564 145
Output: Strong no 145 found at index: 5
*/

import java.io.*;
class Program{
	static boolean strongNum(int n){
		int temp =n;
		int sum = 0;
		while(temp!=0){
			int fact = 1;
			int a = temp%10;
			for(int i = 1 ; i<=a ; i++){
				fact = fact*i;
			}
			sum = sum+ fact;
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
		System.out.print("Strong Number Found At: ");
		for(int i = 0 ; i<arr1.length; i++){
			if(strongNum(arr1[i])==true){
				System.out.println(i);
			}


		}
	}
}




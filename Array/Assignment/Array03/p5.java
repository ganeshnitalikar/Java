/*
WAP to find a Perfect number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 496 564
Output: Perfect no 496 found at index: 3
 */


import java.io.*;
class Program{
	static boolean perfectNum(int n){
		int temp =n;
		int sum = 0;
		for(int i = 1 ; i<temp ; i++){
			if(temp%i==0){
				sum = sum + i;
			}
		}
		if(sum==temp){
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
		System.out.print("Perfect Number Found At: ");
		for(int i = 0 ; i<arr1.length; i++){
			boolean t = perfectNum(arr1[i]);
			if(perfectNum(arr1[i])==true){
				System.out.println(i);
			}
		}	

	}
}

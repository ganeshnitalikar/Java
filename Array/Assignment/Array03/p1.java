/*
Write a program to print count of digits in elements of array.
Input: Enter array elements : 02 255 2 1554
Output: 2 3 1 4
 */


import java.io.*;
class Program1{
	int countDigits(int n){
		int temp = n;
		int sum = 0;

		while(temp!=0){
		sum++;
		temp = temp/10;
		}
		return sum ;

	}
	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Program1 obj = new Program1();
		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());
		int arr1[] = new int[size];

		for(int i = 0; i<arr1.length; i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i<arr1.length; i++){
			
			int sum = obj.countDigits(arr1[i]);
			System.out.println("Digits In " + i + "are : " + sum);
		}

	}
}

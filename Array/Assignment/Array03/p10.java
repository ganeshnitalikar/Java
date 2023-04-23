/*
Write a program to print the second min element in the array
Input: Enter array elements: 255 2 1554 15 65 95 89
Output: 15
*/

import java.io.*;
class Program6{
	static void secondMinNum(int[] arr , int size){
		int temp;
		for(int i = 0 ; i<size; i++){

			for(int j = i+1; j<size ; j++){
				if(arr[i]<arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
				}

			}

		}
		System.out.println(arr[size-2]);
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


		System.out.print("Second Minimum Number In Arrray Is : ");
		secondMinNum(arr1 , size);
	}
}

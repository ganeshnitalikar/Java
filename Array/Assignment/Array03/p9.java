/*
Write a program to print the second max element in the array
Input: Enter array elements: 2 255 2 1554 15 65
Output: 255
*/

import java.io.*;
class Program6{
	static void secondMaxNum(int[] arr , int size){
		int temp;
		for(int i = 0 ; i<size; i++){

			for(int j = i+1; j<size ; j++){
				if(arr[i]>arr[j]){
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


		System.out.print("Second Max Number In Arrray Is : ");
		secondMaxNum(arr1 , size);
	}
}


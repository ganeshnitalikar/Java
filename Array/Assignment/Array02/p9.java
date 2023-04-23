/*
Write a Java program to merge two given arrays.
Array1 = [10, 20, 30, 40, 50]
Array2 = [9, 18, 27, 36, 45]
Output :
Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
Hint: you can take 3rd array
*/
import java.io.*;
class Program9{
	public static void main(String ganesh[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size Of First Array :");		
		int size1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Size Of Second Array:");
		int size2 = Integer.parseInt(br.readLine());
		int arr1[] = new int[size1];
		int arr2[] = new int [size2];
	
		System.out.println("Enter Elements Of First Array: ");
		for(int i = 0; i<arr1.length ; i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}


		System.out.println("Enter Elements Of Second Array: ");
		for(int i = 0; i<arr1.length ; i++){
			arr2[i] = Integer.parseInt(br.readLine());
		}
		int size3 = arr1.length + arr2.length;
		int arr3[] = new int[size3];

		for(int i = 0 ; i<arr1.length; i++){
			arr3[i] = arr1[i];
		}
		int j=0;
		for(int i = arr1.length; i<arr3.length ; i++){
			arr3[i] = arr2[j];
			j++;
		}
		System.out.println("Merged Array : ");
		for(int i = 0; i<arr3.length; i++){
			System.out.print(arr3[i] + " ");
				}
	}
}

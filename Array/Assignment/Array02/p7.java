/* 
 
WAP to find the common elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Common elements :
1
2

*/



import java.io.*;
class Program1{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int arr1[] = new int[size];

		System.out.println("Enter Elements For First Array : ");
		for(int i = 0 ; i< arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter Elements For Second Array : ");
		for(int i = 0; i<arr.length; i++){
			arr1[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Common Elements Are : ");
		for(int i = 0; i<arr.length; i++){
			for(int j =0 ; j<arr1.length ; j++){
				if(arr[i]==arr1[j]){
					System.out.println(arr[i]);

				}
			}
		}


	}
}

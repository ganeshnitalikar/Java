/* 
WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2
*/


import java.io.*;
class Program1{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter Elements : ");

		for(int i = 0 ; i< arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter Element To Search : ");
		int ele = Integer.parseInt(br.readLine());

		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i]==ele){
				System.out.println("Element Found At Index : " + i);
			}
		}

	}
}

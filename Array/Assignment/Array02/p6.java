/* 
WAP to take size of array from user and also take integer elements from user
find the maximum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: max element = 5
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
			int var = arr[0];
		for(int i = 0 ; i< arr.length ; i++){
			if(var<arr[i])	
			{
				var = arr[i];
			}
		
		}
		System.out.println("Smallest Number In Array : " + var);

	}
}

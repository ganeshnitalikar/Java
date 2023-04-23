/* 
 Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26
 */



import java.io.*;
class Program1{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		int even_sum = 0;
		int odd_sum = 0;
		int arr[] = new int[size];
		System.out.println("Enter Elements : ");

		for(int i = 0 ; i< arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
			even_sum = even_sum + arr[i];
			}else{
				odd_sum = odd_sum + arr[i];	
			}

		}
		System.out.println("EVEN SUM : " + even_sum);
		System.out.println("ODD SUM : " + odd_sum);

	}
			
}

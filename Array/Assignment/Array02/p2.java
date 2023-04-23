/* WAP to find the number of even and odd integers in a given array of integers
Input: 1 2 5 4 6 7 8
Output:
Number of Even Elements: 4
Number of Odd Elements : 3
 */
  


import java.io.*;
class Program1{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int odd_count = 0;
		int even_count = 0;
		System.out.println("Enter Elements : ");

		for(int i = 0 ; i< arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
				even_count++;
			}else{
				odd_count++;
			}
		}
		System.out.println("ODD COUNT : " + odd_count);
		System.out.print("EVEN COUNT : " + even_count);

	}
}

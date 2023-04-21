//
//WAP TO TAKE SIZE OF ARRAY FROM USER AND TAKE INTEGER ELEMENTS FROM USER AND PRINT SUM OF ADD ELEMENTS ONLY

import java.io.*;
class Program1{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("Enter Number Of Elements For Array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		int sum = 0 ;
			
		System.out.println("Enter Elements");
		
		for(int i=0 ; i<arr.length ; i++){
			
		arr[i] = Integer.parseInt(br.readLine());
		if(arr[i]%2!=0){
			sum = sum + arr[i];
		}
		}
		System.out.println(sum);	


	}
}

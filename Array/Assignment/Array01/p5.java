// take 10 number as input and print numbers which are divisible by 5 
//

import java.io.*;

class Program4{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size Of Array : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Elements: ");

		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0 ; i< arr.length ; i++){

			if(arr[i]%5==0){
				System.out.println(arr[i]);
			}
		}

	}
}


/*
 WAP to find a palindrome number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 564

Output: Palindrome no 252 found at index: 2
 */

import java.io.*;
class Program6{
	static boolean palindrome(int n){
		int temp =n;
		int rev = 0;
		while(temp!=0){
			int a = temp%10;
			rev = rev*10 + a;
			temp= temp/10;
		}
		if(rev==n){
			return true;
		}	
		else{
			return false;
		}
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
		System.out.print("Palindrome Number Found At: ");
		for(int i = 0 ; i<arr1.length; i++){
			if(palindrome(arr1[i])==true){
				System.out.println(i);
			}


		}
	}
}




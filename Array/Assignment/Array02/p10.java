/* 
WAP to print the elements whose addition of digits is even.
Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
Input :
Enter array : 1 2 3 5 15 16 14 28 17 29 123
Output: 2 15 28 17 123
*/
import java.io.*;
class Program10{
	int sum(int n){
		int temp = n;
		int sum = 0;
		while(temp!=0){
			int a = temp%10;
			sum = sum+a;
			temp = temp/10;
		}
		return sum;
	}

	public static void main(String ganesh[]) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Program10 obj = new Program10();
	System.out.println("Enter Size Of Array : ");
	int size = Integer.parseInt(br.readLine());
	int arr1[] = new int[size];
	System.out.println("Enter Elements : ");
	for(int i =0 ; i<arr1.length ;i++){ 	
		arr1[i] = Integer.parseInt(br.readLine());

	}
	System.out.println("Elemets With Even Sum Of Digits : ");
	for(int i = 0 ;i< arr1.length; i++){
		int sum = obj.sum(arr1[i]);
		if(sum%2==0){
			System.out.println(arr1[i]);
		}
	}
	}
}

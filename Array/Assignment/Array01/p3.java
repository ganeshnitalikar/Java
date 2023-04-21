// WAP TO TAKE SIZE OF ARRAY FROM USER AND ALSO TAKE INTEGER ELEMENTS FROM USER PRINT PRODUCT OF ODD INDEX ONLY
//
import java.io.*;
class Program3{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Enter Size Of Array : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int prod = 1;
		
		System.out.println("Enter Elements of array: ");
		
		for(int i= 0; i<arr.length ; i++){

		arr[i] = Integer.parseInt(br.readLine());
		
		if(i%2!=0){
			prod = prod*arr[i];
		}
		} System.out.println("Product : " + prod);
		}	}

		
		
		
		

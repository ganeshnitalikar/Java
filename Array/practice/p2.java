//
//
import java.io.*;
import java.util.*;
class JaggedArray{
public static void main(String ganesh[]){
	BufferedReader br = new BufferedReader(InputStreamReader(System.in));
	int arr[][] = {{10,20,30},{40,50},{60}};
	System.out.println("Enter Rows");
	int row = Integer.parseInt(br.readLine());
	
	int arr1[][] = new int[3][];

	arr1[0] = new int[]{10,20,30};
	arr1[1] = new int[]{40,50};
	arr1[2] = new int[]{60};

	for(int[] x : arr1){
		for(int y : x){
System.out.println(y);}
	}
	System.out.println(arr1[1][2]);
}
}

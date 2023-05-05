/*
write a program to print a series of strong numbers from entered range. ( Take a start and end number
from a user )
Input:-
Enter starting number: 1
Enter ending number: 150
Output:-
Output: strong numbers between 1 and 150
1 2 145
*/
import java.io.*;
class Program1 {
    public static void main(String[] ganesh) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter Lower Limit");
       int low = Integer.parseInt(br.readLine());
       System.out.println("Enter Upper Limit");
       int high = Integer.parseInt(br.readLine());



       for(int i = low ; i<= high ; i++){
		int temp = i;
		int sum =0;
		while(temp!=0){
			int fact = 1 ;
			int a = temp%10;
			for(int j = 1;j<=a;j++){
			fact= fact*j;
			}
			sum = sum + fact;
			temp = temp/10;
		}
		if(sum==i){
			System.out.println(i);
		}
	

       }
    }
}


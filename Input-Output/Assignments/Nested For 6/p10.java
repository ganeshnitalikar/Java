/*
Write a program to take range as input from the user and print Armstrong numbers. ( Take a start and
end number from a user )
Input: Enter start: 1
Enter end: 1650
Output: Armstrong numbers between 1 and 1650
1 2 3 4 5 6 7 8 9 153 370 371 407 1634
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
		int sum = 0;
		int count =0;
		while(temp!=0){
			count++;
			temp = temp/10;
		}
		temp = i;
		while(temp!=0){
			int multi = 1; 
			int a = temp%10;
			for(int j = 1; j<=count; j++){
				multi= multi*a;
			}
			sum = sum + multi;
			temp= temp/10;
		}
		if(sum==i){
			System.out.println(i);
		}
		

	  }
    }
}


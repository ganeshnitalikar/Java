//Palindrome number from lower to upper limit

import java.io.*;
class Program1 {
    public static void main(String[] ganesh) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Enter Lower Limit");
       int low = Integer.parseInt(br.readLine());
       System.out.println("Enter Upper Limit");
       int high = Integer.parseInt(br.readLine());
       
       for(int i = low ; i<= high ; i++){
            int N = i;
		    int temp,a=N,rev =0;
            while(N!=0){
			    temp = N%10;
			    rev = rev*10 + temp;
			    N = N/10;
		    }
		    if(rev==i){
		        System.out.println(i);
		    }
        }
       }
        
}

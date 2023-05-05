//program to print perfect square between range

import java.io.*;
class Program1 {
    public static void main(String[] ganesh) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Enter Lower Limit");
       int low = Integer.parseInt(br.readLine());
       System.out.println("Enter Upper Limit");
       int high = Integer.parseInt(br.readLine());
       int count = 0;
       for(int i = low ; i<= high ; i++){
		    while(low*low<=high){
			    System.out.println(low*low);
			    low++;
		    }
       }
    }
}

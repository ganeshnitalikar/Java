//perfect number between range


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
		   int N=i;
		   int sum =0 ;
		   for( int j=1;j<N;j++){
			 if(N%j==0){
				 sum = sum + j;
			 }
		    }
		    if(sum==N){
			    System.out.println(N);
		    }
       }
    }
}

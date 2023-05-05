import java.io.*;
class Program1 {
    public static void main(String[] ganesh) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Enter Lower Limit");
       int low = Integer.parseInt(br.readLine());
       System.out.println("Enter Upper Limit");
       int high = Integer.parseInt(br.readLine());
       for(int i = low ; i<= high ; i++){
           int n = i;
		    int count=0;
		    for(int j= 1; j<=n; j++){
			    if(n%j==0){
			        count++;
			    }
		    }
		    if(count>2){
			    System.out.println(n);
		    }
       }
    }
}

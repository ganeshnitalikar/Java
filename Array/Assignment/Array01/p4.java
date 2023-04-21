// wap to take 7 charachters as an input print only vowels the array 
import java.io.*;

class Program4{
	public static void main(String ganesh[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size Of Array : ");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];

		System.out.println("Enter Elements: ");

		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = (char)br.read();
			br.skip(1);
	}
		for(int i = 0 ; i<arr.length ; i++){
			if(
					arr[i]=='a' ||
					arr[i]=='e'  ||	
					arr[i]=='i'||
					arr[i]=='o'||
					arr[i]== 'u'||
					arr[i]=='A'||
					arr[i]=='E'||
					arr[i]=='I'||
					arr[i]=='O'||
					arr[i]=='U'){
	System.out.print("Entered Vowels : " +arr[i]);
}

		}
}
}

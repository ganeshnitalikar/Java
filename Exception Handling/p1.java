import java.io.*;
class Program {
	
	
	static String m1(BufferedReader br)throws IOException{
		String str = "";
		str = br.readLine();
		int data  = Integer.parseInt(br.readLine());
		return str;
	}
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			m1(br);
		}catch(IOException e){
			System.out.println("IOExcetion caught");
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException caught");
		}finally{
			System.out.println("Finally Block");
		}
	}
}

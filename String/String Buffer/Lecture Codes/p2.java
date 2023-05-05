//implementation of capacity method
//

class Program{
	static int myStrBuffCapacity(StringBuffer str){
		char ch[] =str.toCharArray();
		int count = 1;
		for(int i = 0 ; i<ch.length; i++){
			count++;
		}
		return count;
	}
	public static void main(String ganesh[]){
		StringBuffer str = new StringBuffer("Ganesh");

		System.out.println(myStrBuffCapacity(str));
	}
}

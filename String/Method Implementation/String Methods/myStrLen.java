//implementation of length();
//

class StringDemo{
	static int myStrLen(String str){
		char ch[] =  str.toCharArray();
		int count = 0;
		for(int i =0 ;i<ch.length; i++){
			count++;
		}
		return count;
	}
	public static void main(String ganesh[]){
		String str1 = "Ganesh";
		System.out.println(myStrLen(str1));
		System.out.println(str1.length());
	}
}

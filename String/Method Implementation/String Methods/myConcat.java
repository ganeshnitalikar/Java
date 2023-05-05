//concat method implementation
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
	static String myStrConcat(String str1, String str2){
		int size = myStrLen(str1)+myStrLen(str2);
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		char ch3[] = new char[size];

		for(int i = 0 ; i< ch1.length ; i++){
			ch3[i] = ch1[i];
		}; 
		int j =0 ;
		for(int i = ch1.length ; i<ch3.length; i++){
			ch3[i] = ch2[j];
			j++;
		}
		String str3 = new String(ch3);	
		return str3;
	}
	public static void main(String ganesh[]){
		String str1 = "Ganesh";
		String str2 = "Nitalikar";
		System.out.println(myStrConcat(str1,str2));
	}
}

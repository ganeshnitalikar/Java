//implementation of Equals to method


class EqualsDemo{
	static boolean myEquals(String str1,String str2){
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		if(ch1.length != ch2.length){
			return false;
		}

		for(int i = 0 ; i<ch1.length ; i++){
			if(ch1[i] != ch2[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String ganesh[]){
			String str1 = "Ganesh";
			String str2 = "Ganesh";
			System.out.println(myEquals(str1,str2));

	}
}	

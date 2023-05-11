//implementation of equalsIgnoreCase


class EqualsIgnorecase{
	static boolean myEqualsIgnoreCase(String str1, String str2){
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
			
		if(ch1.length != ch2.length){
			return false;
		}

		for(int i = 0 ; i<ch1.length; i++){
			if(ch1[i]-ch2[i] == 32 || ch1[i]-ch2[i] == -32 || ch1[i]-ch2[i]==0 ){
				return true;
			}else {
				return false;
			}
		}
		return true;

	}
	public static void main(String ganesh[]){
		String str1  = "Ganesh";
		String str2 = "Ganesh";
		String str3 = "ganesh";
		String str4 = "gane";

		System.out.println(myEqualsIgnoreCase(str1,str2));
		System.out.println(myEqualsIgnoreCase(str2,str3));
		System.out.println(myEqualsIgnoreCase(str3,str4));
		System.out.println(myEqualsIgnoreCase(str4,str3));
	}
}

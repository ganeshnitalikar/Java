//String and StringBuffer are sibling classes hence they are not compatible with each other 
//if we try to store stringbuffer in string it gives incompatiable type error 
//similarly string cannot be converted into stringbuffer
//when we use str3.append(`String`); return type of append method is the object which is passed to that method due to this new object is not created 
//identityhashcode of str3 , str4 are same 


class SBDemo {
	public static void main(String ganesh[]){
		String str1 = "Shashi";
		String str2 = new String("Bagal");
		StringBuffer str3 = new StringBuffer("Core2Web");

		StringBuffer str4 = str3.append(str1);
		String str5 = str1.concat(str2);
		//StringBuffer str6 = new StringBuffer(str3.append(str1));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		//System.out.println(str6);

	}
}	

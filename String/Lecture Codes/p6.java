//in following code 6 strings are declared but only 5 objects are formed 
//all string which are initialized with new keyword gets different object on heap
//while other string get object on constant pool
//str1 and str2 are same string on scp hence only one object is created and reference of that object is stored in str1 and str2


class StringDemo{
	public static void main(String ganesh[]){
		String str1 = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		String str4 = new String("ABC");
		String str5 = new String("BC");
		String str6 = "BC"
		
	}
}

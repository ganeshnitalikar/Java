//str1 creates new object in scp 
//for str2 the address of str1 is passed to str2 
//hence both str1 and str2 are referring to a same object in scp
//but in case of str3 new keyword is used hence a object is created on heap with same value as str2 i.e "Kanha"


class StringDemo{
	public static void main(String ganesh[]){
		String str1 = "Kanha";
		String str2 = str1;
		String str3 = new String(str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}

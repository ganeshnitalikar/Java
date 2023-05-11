class Program{
	public static void main(String ganesh[]){
		String str1 = "String 1";
		String str2 = new String("String 2");
		StringBuffer str3 = new StringBuffer("String 3");
		StringBuffer str4 = new StringBuffer(str3.append(str1));

		System.out.println("Identity Hash Code Of Str1 : " + System.identityHashCode(str1));
		System.out.println("Identity Hash Code Of Str2 : " + System.identityHashCode(str2));
		System.out.println("Identity Hash Code Of Str3 : " + System.identityHashCode(str3));
		System.out.println("Identity Hash Code Of Str4 : " + System.identityHashCode(str4));

		StringBuffer str5 = str3.append(str1);
		StringBuffer str6 = new StringBuffer();

		System.out.println("Identity HashCode of str3 after appending :"+System.identityHashCode(str3));
		System.out.println("identity hashcode of str5 : " + System.identityHashCode(str5));
		System.out.println("Identity HashCode Of str4 : " + System.identityHashCode(str4));
		
		System.out.println(str3.append(str1));

	}
}

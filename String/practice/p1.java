class StringDemo{
	public static void main(String ganesh[]){
		String str1 = "Ganesh";
		String str2 ="Nitalikar";

		String str3 = str1.concat(str2);

		System.out.println(str1.valueOf('G'));
		System.out.println(String.join(" ",str1,str2));
		System.out.println(str1.charAt(5));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.length());
		String str4 = "ganesh Nitalikar ";
		System.out.println(str4.trim());
		System.out.println(str4.strip());

		char[] arr = str1.toCharArray();

		for(char x : arr){
			System.out.println(x);
		}
		System.out.println(str2.split("i",2));
	}
}

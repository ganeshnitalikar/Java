class Core2Web {

	public static void main(String[]args) {

		String str1 = new String("java");
		String str2 = "java";

		System.out.println(str1 == str2);
	}
}
//string literal goes to scp and string created by new creates new object on heap, == operator checks address not the value at address 

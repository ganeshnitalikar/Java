class Core2Web{
	public static void main(String args[]){
		StringBuilder strBuilder = new StringBuilder("String");
		StringBuffer strBuffer = new StringBuffer(strBuilder);

		String str=  new String(strBuffer);

		System.out.println(str.replace('t','p'));
		System.out.println(str);
	}
}

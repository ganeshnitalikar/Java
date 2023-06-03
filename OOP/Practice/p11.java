class Program {
	static int a = 10;
	static int b = 20;
	static  {
		int c = 30;
		System.out.println("before main");
	}
	public static void main(String args[]){
		
		System.out.println(a);
		System.out.println(b);
	}
}

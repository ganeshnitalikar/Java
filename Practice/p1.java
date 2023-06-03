class Program{
	static {
		System.out.println("Static Block Of Program");
		Demo obj = new Demo();
	}
}

class Demo{
	static {
		System.out.println("Static Block of Demo");

	}
	public static void main(String args[]){
		Program ab = new Program();
		
	}
}

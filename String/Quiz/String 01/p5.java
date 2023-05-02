class Core2Web{
	public static void main(String[] args) {
		String s1 = new String("core2web");
		String s2 = new String("core2web");
		if(s1 == s2)
			System.out.print("True 1 ");
		if(s1.equals(s2))
			System.out.print("True 2 ");
		if(s1.hashCode() == s2.hashCode())
			System.out.print("True 3 ");
	}
}
//true2:content equal true3:identical hashcodes being same content

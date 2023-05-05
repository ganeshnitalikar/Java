class Program{
public static void main(String args []){
	StringBuffer br = new StringBuffer();

	System.out.println(System.identityHashCode(br));

	System.out.println(br.capacity());
	br.append("LENGTHOFTHISSTRING20");

	System.out.println(br.capacity());

	System.out.println(System.identityHashCode(br));
	br.append("LENGTHOFTHISSTRING201234567891011121314151617181920");
	System.out.println(br.capacity());
	System.out.println(System.identityHashCode(br));
}
}

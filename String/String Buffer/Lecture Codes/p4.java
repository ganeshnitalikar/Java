//
//
//

class Program1{
	public static void main(String ganesh[]){
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("Ganesh");
		StringBuffer sb3 = new StringBuffer(100);
			

		System.out.println(sb.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());

		sb.append("First Append");
		sb2.append("ganesh");
		sb3.append("Nitalikar");


		System.out.println(sb.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());

	}
}

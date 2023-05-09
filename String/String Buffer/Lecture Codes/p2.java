//implementation of capacity method
//

class Program{
	/*static int myStrBuffCapacity(StringBuffer str){
		int charCount = 16;
                int count =0;
                int default_count = 16 + str.length();
                if(){
                    return default_count;
                }else if(count>16 && count<charCount){
                    return ;
                }
                return charCount;
	}*/
	public static void main(String ganesh[]){
		StringBuffer str = new StringBuffer("Ganesh");

		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.capacity());
	//	System.out.println(myStrBuffCapacity(str));
		System.out.println();

		str.append("1234567890");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.capacity());
		System.out.println();
	//	System.out.println(myStrBuffCapacity(str));


		str.append("1");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.capacity());
		System.out.println();
	//	System.out.println(myStrBuffCapacity(str));

		str.append("123456");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.capacity());
		System.out.println();

		str.append("12345678901234567890123456789012345");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.capacity());
		System.out.println();
	//	System.out.println(myStrBuffCapacity(str));

			
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println();
	//	System.out.println(myStrBuffCapacity(sb));

		
		sb.append("1234567890");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println();
	//	System.out.println(myStrBuffCapacity(sb));

		
		StringBuffer s = new StringBuffer(225);
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println();
	//	System.out.println(myStrBuffCapacity(s));

		
	}
}

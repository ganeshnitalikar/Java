// Default capacity of string buffer is 16 char
// capacity of string buffer == 16 + length of string passed to object 
// max capacity = (current capacity*2)+2 

class StringBufferDemo{
	public static void main(String ganesh[]){
		StringBuffer str1 = new StringBuffer("Ganesh");
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);
		str1.append(" Nitalikar");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}

}

//String buffer creates object of string on heap which can be modified without creating other object
//i.e STRING BUFFER IS IMMUTABLE



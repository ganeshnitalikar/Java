/*
public boolean equals​(Object anObject)
Compares this string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
For finer-grained String comparison, refer to Collator.

Overrides:
equals in class Object
Parameters:
anObject - The object to compare this String against
Returns:
true if the given object represents a String equivalent to this string, false otherwise
See Also:
compareTo(String), equalsIgnoreCase(String)
*/

class Equals{
	public static void main(String ganesh[]){
		String str1 = "ABC";
		String str2 = "abc";
		String str3 = new String("ABC");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}	
}

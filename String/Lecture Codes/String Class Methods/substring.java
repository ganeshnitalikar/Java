/*
public String substring​(int beginIndex)
Returns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.
Examples:

 "unhappy".substring(2) returns "happy"
 "Harbison".substring(3) returns "bison"
 "emptiness".substring(9) returns "" (an empty string)
 
Parameters:
beginIndex - the beginning index, inclusive.
Returns:
the specified substring.
Throws:
IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object.
*/

class Program{
	public static void main(String ganesh[]){
		String str = "Core2Web Tech";
		System.out.println(str.substring(0,3)); //Core2Web
		System.out.println(str.substring(8)); //tech 
	}
}

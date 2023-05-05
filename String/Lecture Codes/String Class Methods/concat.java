/*
	public String concat​(String str)
Concatenates the specified string to the end of this string.
If the length of the argument string is 0, then this String object is returned. Otherwise, a String object is returned that represents a character sequence that is the concatenation of the character sequence represented by this String object and the character sequence represented by the argument string.

Examples:

 "cares".concat("s") returns "caress"
 "to".concat("get").concat("her") returns "together"
 
Parameters:
str - the String that is concatenated to the end of this String.
Returns:
a string that represents the concatenation of this object's characters followed by the string argument's characters.
*/

class StringDemo{
	public static void main(String ganesh[]){
		String str1 = "Core2";
		String str2 = "Web";

		System.out.println(str1.concat(str2));
	}
}

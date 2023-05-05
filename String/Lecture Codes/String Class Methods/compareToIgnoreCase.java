/*
public int compareToIgnoreCase​(String str)
Compares two strings lexicographically, ignoring case differences. This method returns an integer whose sign is that of calling compareTo with normalized versions of the strings where case differences have been eliminated by calling Character.toLowerCase(Character.toUpperCase(character)) on each character.
Note that this method does not take locale into account, and will result in an unsatisfactory ordering for certain locales. The Collator class provides locale-sensitive comparison.

Parameters:
str - the String to be compared.
Returns:
a negative integer, zero, or a positive integer as the specified String is greater than, equal to, or less than this String, ignoring case considerations.
Since:
1.2
See Also:
Collator
*/

class Program {
	public static void main(String ganesh[]){
		String str1 = "SHASHI";
		String str2 = "shashi";
		System.out.println(str1.compareToIgnoreCase(str2));
	}
}

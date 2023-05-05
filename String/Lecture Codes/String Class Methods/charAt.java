/*
public char charAt​(int index)
Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
If the char value specified by the index is a surrogate, the surrogate value is returned.

Specified by:
charAt in interface CharSequence
Parameters:
index - the index of the char value.
Returns:
the char value at the specified index of this string. The first char value is at index 0.
Throws:
IndexOutOfBoundsException - if the index argument is negative or not less than the length of this string.
*/

class methodDemo{
	public static void main(String ganesh[]){
		String str = "Core2Web";
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(8));
	}
}

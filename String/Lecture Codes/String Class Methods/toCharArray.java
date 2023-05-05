/*
public char[] toCharArray()
Converts this string to a new character array.
Returns:
a newly allocated character array whose length is the length of this string and whose contents are initialized to contain the character sequence represented by this string.
*/

class Program{
	public static void main(String ganesh[]){
		String str = "Ganesh";

		char ch[] =  str.toCharArray();
		for(char x : ch){
			System.out.println(x);
		}
	}
}

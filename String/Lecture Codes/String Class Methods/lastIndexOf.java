/*
public int lastIndexOf​(String str, int fromIndex)
Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.
The returned index is the largest value k for which:


     k <= Math.min(fromIndex, this.length()) &&
                   this.startsWith(str, k)
 
If no such value of k exists, then -1 is returned.
Parameters:
str - the substring to search for.
fromIndex - the index to start the search from.
Returns:
the index of the last occurrence of the specified substring, searching backward from the specified index, or -1 if there is no such occurrence. 
*/

class Program {
	public static void main(String ganesh[]){
		String str1 = "Shashi";
		System.out.println(str1.lastIndexOf('h',0));
		System.out.println(str1.lastIndexOf('i',3));
	}
}

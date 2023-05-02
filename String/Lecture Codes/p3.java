//
//
//
//

class NullPointerDemo{
	public static void main(String ganesh[]){
		int arr1[][] = {{},{},{}};   //Complete declaration
		int arr2[][] = new int[2][];  //Incomplete declaration

		System.out.println(arr1.length);  //3
		System.out.println(arr1[0].length);  //0

		System.out.println(arr2.length);   //2
		System.out.println(arr2[0].length);  //Null Pointer Exception
	}
}

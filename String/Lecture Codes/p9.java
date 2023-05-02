//str1 and str2 creates two object on scp
//concat() method stackframe gets pushed on stack 
//new object gets created with this method ("ShashiBagal") but this object does not have any reference as we are not storing this object address in any string
//after the execution of concat method its stackframe gets poped and control is returned to main method
//str1 and str2 both are same as before


class StringDemo{
	public static void main(String ganesh[]){
	String str1 = "Shashi";
	String str2 = "Bagal";

	System.out.println(str1);
	System.out.println(str2);

	str1.concat(str2);

	System.out.println(str1);
	System.out.println(str2);
	}	
}

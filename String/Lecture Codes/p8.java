//*****STRINGS IN JAVA ARE IMMUTABLE***
//
//for str1 and str2 two different objects are created on scp
//for str3 another object is created on scp 
//but in case of str4 , str1+str2 internally give call to new hence it creates new object on heap 
//even though the value of str3 and str4 is same but objects for these two are different

class StringDemo{
	public static void main(String ganesh[]){
		String str1 = "Ganesh";
		String str2 = "Nitalikar";

		System.out.println(str1 + str2);

		String str3 = "GaneshNitalikar";
		String str4 = str1 + str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	}
}

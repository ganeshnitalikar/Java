//implementation of charAt method 


class StringDemo{
	static int myStrLen(String str){
		char ch[] =  str.toCharArray();
		int count = 0;
		for(int i =0 ;i<ch.length; i++){
			count++;
		}
		return count;
	}
	static void myCharAt(String str , int index){
		char arr[] = str.toCharArray();
		char character ;
		if(index<arr.length && index>=0){
			
			character = arr[index];
			 System.out.println(character);
		}else{
			System.out.println("STRING INDEX OUT OF BOUNDS EXCEPTION");
			
		}


	
	}
	public static void main(String ganesh[]){
		String str1 = "Ganesh";
		myCharAt(str1,4);
		myCharAt(str1,6);
		myCharAt(str1,0);
	}
}

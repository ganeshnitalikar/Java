//implementation of capacity()
//

class SBCapacity{
	static int mySBCapacity(StringBuffer str){
		int default_capacity =16;
		int capacity;
		int count = 0;
		for(int i = 0 ; i<str.length(); i++){
			count++;
		}
		if(count!=0){
			default_capacity += count;
		}else if(count>default_capacity ){
			return capacity = default_capacity;
		}else if(count<=default_capacity){
			capacity = (default_capacity+1)*2;
		}
		return default_capacity;
	}

	public static void main(String[] ganesh){
		StringBuffer sb = new StringBuffer("Ganesh");

		System.out.println(mySBCapacity(sb));

		sb.append("12345");

		System.out.println(mySBCapacity(sb));
	}
}

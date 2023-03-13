
//given the temp of person in fernheit print whether the person has high normal low temp
//>98.6 high
//98.0 <= AND <= 98.6 NORMAL
//<98.0

class Temp{
	public static void main(String args[]){
		float temp = 99.0f;
		if(temp>98.6f){
			System.out.println("High");
		}
		else if(temp<98.0){
			System.out.println("Low");
		}
		else{
			System.out.println("Normal");
		}
	}
}

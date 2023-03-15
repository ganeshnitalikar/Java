
//Write a unique real-time example of If ElseIf Else Ladder

class Ladder {
	public static void main(String args[]){
		int marks = 80;
		if(marks<=100){
			if(marks>=90){
				System.out.println("A");
			}else if(marks>=75){
				System.out.println("B");
			}else if(marks>=60){
				System.out.println("C");
			}else if(marks>=35){
				System.out.println("P");
			}else if(marks<35){
				System.out.println("Fail");
			}
		}else{
			System.out.println("Enter Correct Marks");
		}
	}
}


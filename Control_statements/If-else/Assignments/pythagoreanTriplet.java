//Program 9: Write a program in java to accept three numbers and check whether they are Pythagorean triplets or not
//example (what is a Pythagorean triplet):
//a=3,b=4,c=5
//if a*a+b*b=c*c
//then
//its pythagorean triplet
//else
//not a Pythagorean triplet
//input1:
//a=3,b=4,c=5
//Output: it is a Pythagorean triplet
//input2:
//a=1, b=6,c=9
//Output: It is not a Pythagorean triplet
//input3:
//a=2, b=2,c=2
//Output: ?????
//

class PythagoreanTriplet{
	public static void main(String args[]){
		int a = 3;
		int b = 4;
		int c = 5;
		if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b){
			System.out.println("It is a pythagorean Triplet");
		}else{
			System.out.println("It is not pythagorean triplet");
		}
	}
}

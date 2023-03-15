// Compare three numbers

class ThreeNum{
	public static void main(String args[]){
		int a =2;
		int b =3;
		int c =4;

		if(a>b && a>c){
			System.out.println(a + " " +"Is greater");
		}else if(b>a && b>c){
			System.out.println(b + " " + "Is Greater");
		}else if(c>a && c>b){
			System.out.println(c + " " + "Is Greater");
		}else if(a==b || b==c || c==a){
			System.out.println("Two Of Three Numbers Are Equal");
		}else{
			System.out.println("Enter Different Numbers");
		}
	}
}

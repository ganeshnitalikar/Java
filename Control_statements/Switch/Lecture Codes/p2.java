/*
If we use duplicate case labels it gives error as 
error: duplicate case label*/
class SwitchDemo{
	public static void main(String ganesh[]){
		int x = 5;
		switch (x){
		case 1: System.out.println("one");
			break;
		case 5: System.out.println("First Five");
			break;
		case 5: System.out.println("Second Five");
			break;
		default : System.out.println("No Match ");
			break;
		}
		System.out.println("After Switch");

	}
}

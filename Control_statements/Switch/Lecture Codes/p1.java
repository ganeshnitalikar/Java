/*
If we do not use break statement, after finding the matching case the remaining part of switch is considered as single block hence it prints all remaining statement including default
default has least priority

OUTPUT:-
FOUR 
FIVE 
SIX 
NO MATCH 

*/


class SwitchDemo{
	public static void main(String ganesh[]){
		int x = 3;
		switch (x){
		case 1: System.out.println("one");
		case 2: System.out.println("Two");
		case 3: System.out.println("Three");
		case 4: System.out.println("Four");
		case 5: System.out.println("Five");
		case 6: System.out.println("Six");
		default : System.out.println("No Match ");
		}
		System.out.println("After Switch");

	}
}

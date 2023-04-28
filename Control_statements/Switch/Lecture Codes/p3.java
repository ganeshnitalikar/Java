/*
characters are intergers internally
e.g 'A' == 65
*/
class SwitchDemo{
	public static void main(String[] ganesh){
		int ch =65;

		switch(ch){
			case 'A': System.out.println("Char-A");
				   break;
			case 65: System.out.println("Num-A");
				   break;
			case 66: System.out.println("Num-66");
				   break;
			case 'B': System.out.println("Char-B");
				   break;
			Default: System.out.println("Invalid");
					break;
		}
		}
	}

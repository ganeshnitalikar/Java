public class Core2Web {
	int var1 = 10;
	public static void main(String[] args) {
		
		Core2Web c2w = new Core2Web();
		System.out.println(++c2w.var1);
	}
}
class Main {
	public static void main(String[] args) {
		System.out.println("In Main");
		Core2Web c2w = new Core2Web();
		System.out.println(++c2w.var1);
	}
}        


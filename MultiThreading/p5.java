class Mythread implements Runnable {
	
	public void run(){
		System.out.println("In Run");
	}
	public void start(){
		System.out.println("In Start");
	}
}
class ThreadDemo{

	public static void main(String args[]){
		
		Mythread t  = new Mythread();
		t.start();
		System.out.println("In Main");
	}
}

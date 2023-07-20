class Thread1 extends Thread{
	public void run(){
		System.out.println("In Thread-0");
	}
	void gun(){
		System.out.println("In GUn");
	}
}
class Thread2 extends Thread{
	public void run(){
		System.out.println("In Thread-1");
	}
}
class Thread3 extends Thread{
	public void run(){
		System.out.println("In Thread-2");
	}
}
class Demo{
	public static void main(String[] args){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();

		t1.start();
		t2.start();
		t3.start();

		new Thread1()::gun;
		System.out.println("End Of Main ");
	}
}

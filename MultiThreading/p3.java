class MyThreadDemo extends Thread{
	
	public static void main(String[] args){

		Thread t = new MyThreadDemo(){
			public void run(){
				System.out.println("In thread-0");
			}
		};
		Thread t1 = new Thread(){
			public void run(){
				System.out.println("In thread-1");
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				System.out.println("In thread-2");
			}
		};
		t.run();
		t1.run();
		t2.run();
		System.out.println("In Thread main");
	}
}



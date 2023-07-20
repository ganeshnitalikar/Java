class MyThreadDemo extends Thread{
	public void run(int a){
		//MyThreadDemo obj3 = new MyThreadDemo();
//		obj3.start();
		//System.out.println("In Run Method");
	}	
	public void run(){
		this.run(20);
		System.out.println("in thread-0");
		System.out.println(Thread.currentThread().getName());
		//MyThreadDemo obj3 = new MyThreadDemo();
		//obj3.start(); //	try{
	//	Thread.sleep(2000);
	//	}catch(InterruptedException e){

	//	}
	}		
	
	public static void main(String[] args)throws InterruptedException{
		MyThreadDemo obj = new MyThreadDemo();
		obj.start();
		Thread.sleep(2000);
	//	MyThreadDemo obj1 = new MyThreadDemo();
	//	obj1.start();
	//	Thread.sleep(2000);
		//obj.run();
		System.out.println("In main thread");
	}
}

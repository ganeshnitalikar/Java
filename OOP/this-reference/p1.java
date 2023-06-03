class Player{
	int jerNo = 0;
	String name = null;
	Player(){
		System.out.println("No args constructor");
	}
	Player(int jerNo,String name){
		this();
		this.jerNo = jerNo;
		this.name = name;
	}
	void info(){
		System.out.println(jerNo + "=" + name);
		System.out.println(System.identityHashCode(jerNo));
	}
}
class Client{
	public static void main(String args[]){
	Player obj1 = new Player(18,"Virat");
	obj1.info();
	String str = "Virat";
	str = "MSD";
	System.out.println(System.identityHashCode(str));
	Player obj2 = new Player(7, "MSD");
	obj2.info();

	Player obj3 = new Player(45,"Rohit");
	obj3.info();
	}
}


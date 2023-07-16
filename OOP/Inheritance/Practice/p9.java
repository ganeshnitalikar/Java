class Demo{
	void fun(int x , float y ){
		System.out.println("in Int-Float ");
	}
	void fun(float y , int x){
		System.out.println("in Int-Float ");
	}

}
class Client{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun(10.5f,10);
	}
}

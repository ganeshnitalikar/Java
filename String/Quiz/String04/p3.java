class Core2Web{
	public static void main(String args[]){
		StringBuilder str = new StringBuilder("Builder");
		str.insert(5,new String("0"));
		str.reverse();
		
		System.out.println(str.reverse());

	}	
}

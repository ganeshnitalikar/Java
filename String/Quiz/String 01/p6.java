class Core2Web{
		public static void main(String[] args) {
			String svar1 = "This is a string";
			String svar2 = "This is a string";
			if(System.identityHashCode(svar1) == System.identityHashCode(svar2)){
				System.out.println("Equal");
			}else{
				System.out.println("Not equal");
			}
		 }
}
//both strings have same identity hashcode since marked to same object on scp

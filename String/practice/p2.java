//
//
//
//
//
//


class StringDemo{
		public static void main(String ganesh[]){
			int x = 200; 
			int y = 200;
			
			System.out.println(System.identityHashCode(x));
			System.out.println(System.identityHashCode(y));

			if(x==y){
				System.out.println("equal");
			}else{
				System.out.println("not equal");
			}
		}
	}

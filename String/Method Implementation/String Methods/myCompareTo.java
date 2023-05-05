//implementation of myCompareTo method
//

class Program{

    static int myCompareTo(String str1, String str2){
                char ch1[] = str1.toCharArray();
                char ch2[] = str2.toCharArray();
                int i = 0;
		if(ch1.length!=ch2.length){
			return ch1.length-ch2.length;
		}
                while(i<ch1.length){
                    if(ch1[i]!=ch2[i]){
                          return ch1[i]-ch2[i];
                    }
                    i++;
                }
                return 0;

        }


        public static void main(String ganesh[]){
                String str1 = "Ganesh";
                String str2 = "Ganesh";
		String str5 = "Ganes";
                String str3 = "ganesh";
                String str4 = "ganEsh";
                System.out.println(myCompareTo(str2,str4));
                System.out.println(myCompareTo(str1,str3));
                System.out.println(myCompareTo(str3,str4));
                System.out.println(myCompareTo(str1,str2));
		System.out.println(myCompareTo(str1,str5));
        }
        }

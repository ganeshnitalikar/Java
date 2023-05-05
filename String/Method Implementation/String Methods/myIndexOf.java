//
//
//


class StringDemo {
    static int myIndexOf(String str,char ch, int start){
        char arr[] = str.toCharArray();
        
        if(start>=0 && start<arr.length){
            int j = 0;
            for(int i = start ; i<arr.length; i++){
                if(arr[i]==ch){
                    return j+i;
                }
		j++;
            }
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        String str = "Ganesh";
        System.out.println(myIndexOf(str,'n',2));
        System.out.println(myIndexOf(str,'n',5));
    }
}

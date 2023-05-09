//we can also give StringBuffer capacity while initialization which is called as initial capacity 
//stringbuffer can be appended until this initial capacity is filled
//when the stringbuffer size becomes large than capacity then its capacity is expanded(if space is available) else new string buffer with same properties and new capacity is created 
//new capacity = (current capacity + 1)*2


class SBdemo{
	public static void main(String ganesh[]){
		StringBuffer sb = new StringBuffer(100);
		sb.append("Biencaps");
		sb.append("Core2web");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Incubator");

		System.out.println(sb.capacity());
	}	
}

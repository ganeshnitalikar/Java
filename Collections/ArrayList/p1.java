import java.util.*;

class Demo extends ArrayList{
	
	public static void main(String args[]){
		Demo arr = new Demo();
		Integer i = new Integer(10);
		arr.add(10);
		arr.add(20.4f);
		arr.add(4.5);
		arr.add("string");
		arr.add(10);
		System.out.println(arr);
		System.out.println("Size of arraylist .size() : " +arr.size());

		System.out.println("contains 'string' : "  + arr.contains("string"));
		System.out.println("Index of 10 : " + arr.indexOf(10));
		System.out.println("Last Index of 10: " + arr.lastIndexOf(10));
		System.out.println("removed element at 1 " );
		arr.remove(1);
		System.out.println(arr);

		System.out.println("get 2nd index  " + arr.get(2));
		System.out.println("get 4th index  " + arr.get(3));
		System.out.println("set 2nd index to 20 " + arr.set(2,20));
		System.out.println("set 1nd index to 1000 " + arr.set(1,1000));
		
		System.out.println(arr);
		System.out.println("removed 10 " );
		arr.remove(i);
		ArrayList arrr = new ArrayList();
		arrr.addAll(arr);
		System.out.println("New arrr list  : " + arrr);
		Object[] array = arrr.toArray();

		System.out.println("Printing  array of type object created using toArray() method"); 
		for(Object k : array){
			System.out.println(k);
		}
		System.out.println("added elements 200,300,400,500");
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		System.out.println("removed elements from range 3 to 5(exclusive)");
		System.out.println("method removeRange() has protected access hence we inherit the class ArrayList");
		arr.removeRange(3,5);
		System.out.println(arr);
		System.out.println("clear method call ");
		arr.clear();
		System.out.println(arr);
	}
}

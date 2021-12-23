package LinkedListandHashSet;

import java.util.LinkedList;

public class LLAddRemoveandObjects {

	public static void main(String[] args) {
		LinkedList<String> value=new LinkedList<String>();
		value.add("A");
		value.add("B");
		value.add("C");
		value.addFirst("D");
		value.addLast("E");
		value.add(2, "F");
		System.out.println(value);
		value.remove();
		value.remove("A");
		value.remove(3);
		value.removeLast();
		System.out.println(value);
		//objects
		Object firstval=value.get(0);
		System.out.println(firstval);
		value.set(1, "G");//changes the value
		System.out.println(value);
		value.clear();
		System.out.println(value);

	}

}

package ArrayList;

import java.util.ArrayList;

public class SearchandGetMethodsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> value=new ArrayList<Integer>();
		value.add(10);
		value.add(20);
		value.add(30);
		value.add(40);
		value.add(50);
		value.add(60);
		value.add(70);
		System.out.println(value);
		System.out.println("last index of element 20 is:"+value.lastIndexOf(20));
		System.out.println("index of element is 30 is"+value.indexOf(30));
		System.out.println("element at 5 is"+value.get(5));

	}

}

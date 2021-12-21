package ArrayList;

import java.util.ArrayList;

public class ArrayListCompares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> value=new ArrayList<String>();
		value.add("Hi");
		value.add("good");
		value.add("morning");
		value.add("lunch time");
		System.out.println(value);
		
		ArrayList<String> value_one=new ArrayList<String>();
		value_one.add("Hi");
		value_one.add("good");
		value_one.add("morning");
		value_one.add("lunch time");
		System.out.println(value_one);

		ArrayList<String> array_cmp=new ArrayList<String>();
		for(String temp:value)
			array_cmp.add(value_one.contains(temp)?"yes":"no");
		System.out.println(array_cmp);

	}

}

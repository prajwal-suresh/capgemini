package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> value=new ArrayList<Integer>();
		value.add(10);
		value.add(20);
		value.add(30);
		value.add(40);
		System.out.println(value);
		List<Integer> listvalue=new ArrayList<Integer>();
		listvalue.add(50);
		listvalue.add(60);
		listvalue.add(70);
		value.addAll(listvalue);
		System.out.println(value);
		listvalue.addAll(value);
		System.out.println(listvalue);

	}

}

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronized {

	public static void main(String[] args) {
		List<String> sync=Collections.synchronizedList(new ArrayList<String>()) ;
		sync.add("mobile");
		sync.add("phone");
		sync.add("laptop");
		
		synchronized(sync) {
			Iterator<String> iterator=sync.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
		}
	}

}

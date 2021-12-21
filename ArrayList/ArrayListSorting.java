package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		Student s1=new Student(223, "Chaitanya", 26);
		Student s2=new Student(245, "Rahul", 24);
		Student s3=new Student(209, "Ajeet", 32);
		
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(s1);
		arraylist.add(s2);
		arraylist.add(s3);
		
		
		/*ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(223, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));
*/

		   Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }

	}

}

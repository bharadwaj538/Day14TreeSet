package ai.jobiak.treeset;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> course=new TreeSet<String>();
		course.add("B-tech");
		course.add("M-tech");
		course.add("MBA");
		course.add("IT");
		System.out.println(course);
		
		Course obj=new Course(21,"john",32);
		Course obj2=new Course(23,"doe",34);
		Course obj3=new Course(24,"johny",35);
		Course obj4=new Course(25,"shang",36);
		
		TreeSet treecourse=new TreeSet();
		
		
		treecourse.add(obj);
		treecourse.add(obj2);
		treecourse.add(obj3);
		treecourse.add(obj4);
		System.out.println(treecourse);
		

		
		
	}

}

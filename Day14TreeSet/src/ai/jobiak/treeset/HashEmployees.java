package ai.jobiak.treeset;

import java.util.HashMap;

public class HashEmployees {

	public static void main(String args[]) {
		
		//Employee obj=new Employee(538,"emp1",20000,"Hyderabad");
		//Employee obj1=new Employee(539,"emp2",25000,"Visakhapatnam");
		HashMap emp=new HashMap();
		emp.put(538, "emp1");
		emp.put(542, "emp4");
		emp.put(541, "emp3");
		emp.put(543, "emp6");
		emp.put(540,"emp2");
		emp.put(539,"emp5");
		
		System.out.println(emp);
		System.out.println(emp.size());
		System.out.println(emp.get(540));
		
	}
}

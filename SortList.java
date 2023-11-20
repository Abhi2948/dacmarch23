package org.main.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(50);
//		list.add(20);
//		list.add(70);
//		list.add(10);
//		list.add(60);
//		list.add(80);
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(10,"abhishek",28,80000));
		emp.add(new Employee(20,"pateriya",27,50000));
		emp.add(new Employee(30,"anshul",26,60000));
		emp.add(new Employee(40,"sankalp",25,30000));
		emp.add(new Employee(50,"ramesh",24,40000));
		Collections.sort(emp,new Comparator<Employee>() {
				@Override
				public int compare(Employee o1,Employee o2) {
					return (int)(o2.getSalary()-o1.getSalary());
				}
				});
		System.out.println(emp);
		}
	
}
class MySort implements Comparator<Employee>{
	@Override
	public int compare(Employee o1,Employee o2) {
		return (int)(o1.getSalary()-o2.getSalary());
	}
}

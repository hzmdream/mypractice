package com.hzm.basic.democollection;

import java.util.Comparator;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>( new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getName().compareTo(o2.getName())==0?o1.getAge().compareTo(o2.getAge()):0;
			}
		});
	}
}

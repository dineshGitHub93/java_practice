package com.collections.customobject;

import java.util.Comparator;

public class NameComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}

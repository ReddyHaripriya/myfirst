package com.collections.List;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet studentSet=new HashSet();
		Student st1=new Student(1,"hari","CSE");
		Student st9=new Student(1,"hari","CSE");
		Student st2=new Student(2,"priya","ECE");
		Student st3=new Student(3,"appi","EEE");
		studentSet.add(st1);
		studentSet.add(st2);
		studentSet.add(st3);
		studentSet.add(st9);//allows duplicates
		System.out.println(studentSet);//no Order guaranty
		System.out.println("Size:" +studentSet.size());
		//System.out.println("SecondIndexElement:"+studentSet.get(2));//search is not possible

	}

}

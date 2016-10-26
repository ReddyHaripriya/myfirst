package com.collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List studentList=new ArrayList();
		Student st1=new Student(1,"hari","CSE");
		Student st9=new Student(1,"hari","CSE");
		Student st2=new Student(2,"priya","ECE");
		Student st3=new Student(3,"appi","EEE");
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		studentList.add(st9);//allows duplicates
		System.out.println(studentList);//Order guaranty
		System.out.println("Size:" +studentList.size());
		System.out.println("SecondIndexElement:"+studentList.get(2));
		List linkedList=new LinkedList();
		Student st4=new Student(0,null,null);
		Student st5=new Student(4,"Anish","Rishi");
		linkedList.add(st4);
		linkedList.add(st5);
		System.out.println("linkedlist:"+linkedList);
		
		
		
	}

}

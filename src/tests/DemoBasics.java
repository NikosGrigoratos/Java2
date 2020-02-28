package tests;

import basics.Group;
import basics.Person;
import basics.Release;

import java.util.ArrayList;
import java.util.List;

import basics.Album;
import basics.Compilation;

public class DemoBasics {
	
	public static void main(String args[]) {
		//Our costructors take lists so we created some empty testLists to test the constructors.
		List<String> testList = new ArrayList<String>(); 
		List<Person> personTestList = new ArrayList<Person>();
		List<Object> personGroupTestList = new ArrayList<Object>();
		
	    Person p1 = new Person("Test", "Test", "Test", "Test", "Test", "Test",
				"Test", testList, testList);
		Group g1 = new Group("Test", "Test", "Test", "Test", "Test", "Test", testList, testList, personTestList);
		Release r1 = new Release("Test", "Test", "Test", "Test", "Test", 5);
		Album a1 = new Album("Test", "Test", "Test", "Test", "Test", 5, "Test");
		personGroupTestList.add(p1);
		personGroupTestList.add(g1);
		Compilation c1 = new Compilation("Test", "Test", "Test", "Test", "Test", 5, personGroupTestList);
		
		System.out.println(p1.toString());
		System.out.println(g1.toString());
		System.out.println(r1.toString());
		System.out.println(a1.toString());
		System.out.println(c1.toString()); 
		
		
		
	}
	
}

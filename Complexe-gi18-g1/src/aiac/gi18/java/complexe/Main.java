package aiac.gi18.java.complexe;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		testListComplexe();
		

	}
	
	public static void testListComplexe(){
		Complexe c1=new Complexe(3, 1);
		Complexe c2=new Complexe(10, -1);
		Complexe c3=new Complexe(1,-1);
		
		ListComplexe myList=new ListComplexe();
		myList.add(c1);
		myList.add(c2);
		myList.add(c3);
		
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);
		
		Collections.sort(myList, new ComparatorParImg());	
		System.out.println(myList);
	}

}
//https://codeshare.io/Jbgq4E
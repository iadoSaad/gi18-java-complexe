package aiac.gi18.java.complexe;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Complexe c1=new Complexe(3, 1);
		Complexe c2=new Complexe(1, -1);
		Complexe c3=new Complexe(1,-1);
		
	
		
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.add(c2));
		System.out.println(c1.sub(c2));
		System.out.println(c1.add(1,2));
		
		System.out.println(Complexe.createdComplexe());
		
		List<Complexe> l=new ListComplexe();
		c1.equals(c3);  c1.equals("hekks");
		l.add(c1); l.add(c2); l.add(c1); l.add(c3);
		System.out.println(l);
		

	}

}
//https://codeshare.io/Jbgq4E
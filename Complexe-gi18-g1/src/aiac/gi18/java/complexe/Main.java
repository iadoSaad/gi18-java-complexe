package aiac.gi18.java.complexe;

public class Main {

	public static void main(String[] args) {
		
		Complexe c1=new Complexe(3, 1);
		Complexe c2=new Complexe(1, -1);
		
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.add(c2));
		System.out.println(c1.sub(c2));
		System.out.println(c1.add(1,2));
		
		System.out.println(Complexe.createdComplexe());

	}

}
//https://codeshare.io/Jbgq4E
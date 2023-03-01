package fr.m2i.m2ws.calculatrice;

public class calcule {

	
	public static Integer division(int a,int b) {
		return a/b;
	}
	
	public static Integer addition(int a,int b) {
		return a+b;
	}
	
	public static Integer soustraction(int a,int b) {
		return a-b;
	}
	
	public static Integer multiplication(int a,int b) {
		return a*b;
	}
	
	public static Integer factorielle(int a) {
		if(a==1) return 1;
		else return a*factorielle(a-1);
	}
	
	
}

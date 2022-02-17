package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {  //shortcut for this line is "main+ctl+space". "ctl+space--> autocfomplete
		
	     int i=10;
	     double d=10;
	     
	     System.out.println(i);
	     System.out.println(d);
	     
	     //int num=10.0; Type mismatch: cannot convert from double to int
	     
	     //Casting - is a process of converting the value of one type to another.
	     //We can cast primitive and non primitive data
	     //what & Why
	     //There are two types of casting: 1)Widening/Implicit/Automatic and 2) Narrowing/Explicit/Manual
	     //Widening: byte -> short -> int -> long -> float -> double
	     //Narrowing: double -> float -> long -> int -> short -> byte 
	     //There is always an issues to fit something big into small container, but never other way around. 
	     
	     int num=(int)10.99; //narrowing or explicit casting, we manually converted data
	     System.out.println(num);
	     
	     float f=10.99f;
	     System.out.println(f);
		
		 //Operators: assignment = 
			 

	}

}

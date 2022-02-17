package com.syntax.class09;

public class TaskInClass {
	
	public static void main(String[] args) {
		
		char [] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		//how many elements inside array?
		int size=grades.length;
		System.out.println("Numbers of elements is = "+size);
		
		for (int i=0; i<grades.length; i++) {
		System.out.print(grades[i]+" ");
		}
		
		String[] cities= {"Miami", "LA", "SanFran", "New York", "Iowa", "Dalas"};
		for (int a=0; a<cities.length; a++) {
			System.out.print(cities[a]+" ");
			
			if (cities[a].equals("Miami")) {
				System.out.println("I want to live in Miami");
			}
		}
	}

}

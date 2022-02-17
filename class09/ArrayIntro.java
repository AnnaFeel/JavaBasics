package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=1;
		
		//creating an array that holds 4 elements
		int [] numbers=new int[4];
		
		//storing values/elements inside an array
		numbers[0] =90;
		numbers[2]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]);
		
		//I want to create an array of countries
		
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		
		//countries[5]="Turkey"; *this code wouldn't be printed, it's out of bounds
		
		System.out.println(countries[3]+" & "+countries[4]);
		
		String[] names=new String[5];
		names[1]="Orsan";
		names[2]="Gulnar";
		names[3]="Zakirullah";
		
		System.out.println(names[1]); //Orsan
		System.out.println("Value in index 4 is = "+names[4]);
		
		names[1]="Daniyar";
		System.out.println(names[1]);
		
		//create an array to store 4 different prices
		//find an average of how much we spent 
		
		double[] prices=new double[4];
		prices[0]=5.50;
		prices[1]=2.99;
		prices[2]=9.99;
		prices[3]=4.49;
		
		double average=(prices[0]+prices[1]+prices[2]+prices[3])/4;
		
		System.out.println("On average we spend "+average);
 
	}

}

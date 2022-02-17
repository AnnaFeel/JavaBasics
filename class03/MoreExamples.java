package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		
		boolean hungry=false; //You don't need to compare one boolean with another. 
		
		if(hungry) {
			System.out.println("I am going to eat");
		} else {
			System.out.println("I am going to drink a tea");
		}

		boolean traffic=false;
		
		if(traffic) {
			System.out.println("I am coming home late");
		} else {
			System.out.println("No traffic, I am on time");
		}
		
		/* define a vvariable to store a browser
		 * if browser is chrome --> we are executing tests on chrome
		 * otherwise --> browser is not supported for our test
		 */
		
		String browser="chrome";
		
		if (browser.equals("chrome")) { //with Strings is better to use word equals instead of "=="
			System.out.println("We are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
		}
		
		
		}
		
	}


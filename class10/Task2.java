package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// array with countries and loops with capitals

		String[] countries = { "Russia", "Ukraine", "Australia", "Germany" };
		String capital=null;

		for (int i = 0; i < countries.length; i++) {
			switch (countries[i]) {
			case "Russia":
				capital = "Moscow";
				break;
			case "Ukraine":
				capital = "Kiev";
				break;
			case "Australia":
				capital = "Canbera";
				break;
			case "Germany":
				capital = "Berlin";
				break;
			}
			
			System.out.println("The capital of "+countries[i]+" is "+capital);
		}
		
		System.out.println("------ Another Way -------");
	
		
		for (String country:countries) {
			if (country.equalsIgnoreCase("Russia")) {
				capital="Moscow";
			} else if (country.equalsIgnoreCase("Ukraine")) {
				capital="Kiev";
			} else if (country.equals("Australia")) {
				capital="Canbera";
			} else if (country.equals("Germany")) {
				capital="Berlin";
			}
				System.out.println("The Capital Of "+country+" Is "+capital);
		}

	}

}

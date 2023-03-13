package main;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA","Washington DC");
		
		System.out.println(capitalCities);
		
		String london = capitalCities.get("England");
		System.out.println(london);
		
		capitalCities.remove("England");
		System.out.println("With England removed: " + capitalCities + "\n");
		
		//capitalCities.clear();
		//System.out.println("True means empty: " + capitalCities.isEmpty());
		System.out.println("Only keys:");
		for(String i: capitalCities.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("\nOnly values:");
		
		for(String i: capitalCities.values()) {
			System.out.println(i);
		}

	}

}

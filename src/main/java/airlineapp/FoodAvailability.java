package airlineapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class FoodAvailability {
	
	static HashMap<String, Integer> additionalFeaturesList = new HashMap<String, Integer>();

	/**
	 * This method will display all the foodtypes available Separate list are
	 * declared for morning, noon and evening foodtypes
	 */
	public static void foodTypes() {

		// morning food display
		TreeSet<String> morningFood = new TreeSet<String>();
		morningFood.add("Idly");
		morningFood.add("Poori");
		morningFood.add("Vadai");
		morningFood.add("Dosa");
		morningFood.add("Chappathi");

		for (String key : morningFood) {
			System.out.println(key);
		}

		System.out.println();
		// noon food display
		TreeSet<String> noonFood = new TreeSet<String>();
		noonFood.add("Fish");
		noonFood.add("Briyani");
		noonFood.add("Meals");
		noonFood.add("SeaFoods");
		noonFood.add("DryFoods");

		for (String key : noonFood) {
			System.out.println(key);
		}

		System.out.println();
		// evening food display
		TreeSet<String> beverages = new TreeSet<String>();
		beverages.add("freshly squeezed orange juice");
		beverages.add("tomato juice");
		beverages.add("homemade temonade with fresh mint");
	
		for (String key : beverages) {
			System.out.println(key);
		}
		System.out.println();
		
		//night food display
		TreeSet<String> nightFood = new TreeSet<String>();
		nightFood.add("Idly");
		nightFood.add("Poori");
		nightFood.add("Vadai");
		nightFood.add("Dosa");
		nightFood.add("Chappathi");

		for (String key : nightFood) {
			System.out.println(key);
		}

		System.out.println();

	}

	

}

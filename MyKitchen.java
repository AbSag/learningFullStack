
public class MyKitchen {

	String referTheMenuDay;
	String mealToCook;
	boolean ingrediantsAvailability;
	boolean maidComing;

	static int numberOfPersonToBeFed = 1;

	public MyKitchen() {
		super();
	}

	public MyKitchen(String referTheMenuDay, String mealToCook, boolean ingrediantsAvailability) {
		super();
		this.referTheMenuDay = referTheMenuDay;
		this.mealToCook = mealToCook;
		this.ingrediantsAvailability = ingrediantsAvailability;
	}

}

class Food {

	Food cookingFood() {
		Food f = new Food();
		MyKitchen k = new MyKitchen();

		if (k.maidComing && k.ingrediantsAvailability) {
			System.out.println("food served will be as per the menu");
		} else
			System.out.println("Please change the mealcourse for today");

		return f;
	}
}

class Vessels {

	void cleaningUtensils() {
		System.out.println("Utensils are ready");

	}

}

class GuestComingOver {

	GuestComingOver() {
		MyKitchen m = new MyKitchen();
		++m.numberOfPersonToBeFed;

	}
}

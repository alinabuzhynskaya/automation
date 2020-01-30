
public class RecipeWithMicrowave extends AbstractRecipe {
	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Turn on microvave");
	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");
		System.out.println("Put it in the microvave");
	}

	@Override
	void cleanUp() {
		System.out.println("Clean up utensils");
		System.out.println("Turn off the microwave");

	}
}

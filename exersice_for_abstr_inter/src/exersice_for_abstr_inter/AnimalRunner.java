package exersice_for_abstr_inter;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog() };
		for (int i = 0; i < animals.length; i++) {
			animals[i].bark();
		}
	}

}

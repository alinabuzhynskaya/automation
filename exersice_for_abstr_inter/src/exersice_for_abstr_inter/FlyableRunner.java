package exersice_for_abstr_inter;

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Plane() };
		for (Flyable flyObj : flyingObjects) {
			flyObj.fly();
		}
	}

}

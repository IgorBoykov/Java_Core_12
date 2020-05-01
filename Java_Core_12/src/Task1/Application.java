package Task1;

import java.util.ArrayList;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		ArrayList<Auto> list1 = new ArrayList<Auto>();
		int j = getRandom(1, 10);
		for (int i = 0; i < j; i++) {
			Auto auto = new Auto(getRandom(200, 350), getRandom(2000, 2020), new Kermo(getRandom(16, 24), "metal"),
					new Engine(getRandom(4, 16)));
			list1.add(auto);
		}
		System.out.println(list1);

		list1.clear();
		list1.add(new Auto(320, 2005, new Kermo(16, "metal"), new Engine(10)));
		System.out.println(list1);
	}

	public static int getRandom(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Error");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}

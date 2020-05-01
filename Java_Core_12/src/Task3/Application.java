package Task3;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<Comparable> myList = new ArrayList<>();
		myList.add(1992);
		myList.add(28);
		myList.add(4);
		myList.add("Boykov");
		myList.add("Igor");

		System.out.println(myList);

		myList.remove(0);
		myList.remove(0);
		myList.remove(0);

		System.out.println(myList);

	}

}

/**
 *
 */
package patterns.creational.builder;

/**
 * @author Luigi
 *
 */
public class Buyer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ConcreteHouseBuilder builder = new ConcreteHouseBuilder();

		Architect architect = new Architect(builder);

		architect.setDoors(2);

		architect.setWindows(4);

		House house = architect.createHouse();

		System.out.println("Number of doors: " + house.getDoor().length);

		System.out.println("Number of windows: " + house.getWindow().length);

	}

}

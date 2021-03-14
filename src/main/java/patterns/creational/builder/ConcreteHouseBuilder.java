/**
 *
 */
package patterns.creational.builder;

/**
 * @author Luigi
 *
 */
public class ConcreteHouseBuilder implements HouseBuilder{

	private House house;

	ConcreteHouseBuilder() {

		this.house = new House();

	}


	public void createRoof() {

		house.setRoof(new Roof());

	}

	public void createWall() {

		house.setWall(new Wall());

	}

	public void createDoor(int number) {

		Door [] door = new Door[number];

		house.setDoor( door );

	}

	public void createWindow(int number) {

		Window [] window = new Window[number];

		house.setWindow(window);

	}

	public House getHouse() {

		return house;

	}

}

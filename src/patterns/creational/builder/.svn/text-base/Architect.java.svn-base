/**
 *
 */
package patterns.creational.builder;

/**
 * @author Luigi
 *
 */
public class Architect {

	private ConcreteHouseBuilder builder;

	private int doors = 1;

	private int windows = 2;

	Architect(ConcreteHouseBuilder builder) {

		this.builder = builder;

	}

	public void setDoors(int doors) {

		this.doors = doors;

	}

	public void setWindows(int windows) {

		this.windows = windows;

	}

	House createHouse() {

		builder.createDoor(doors);

		builder.createRoof();

		builder.createWall();

		builder.createWindow(windows);

		House house = builder.getHouse();


		return house;

	}

}

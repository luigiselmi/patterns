/**
 *
 */
package patterns.creational.builder;

/**
 * @author Luigi
 *
 */
public class House {


	private Roof roof = null;

	private Wall wall = null;

	private Door [] door = null;

	private Window [] window = null;

	/**
	 * @return the door
	 */
	public Door [] getDoor() {

		return door;

	}

	/**
	 * @param door the door to set
	 */
	public void setDoor(Door [] door) {

		this.door = door;

	}

	/**
	 * @return the roof
	 */
	public Roof getRoof() {
		return roof;
	}

	/**
	 * @param roof the roof to set
	 */
	public void setRoof(Roof roof) {
		this.roof = roof;
	}

	/**
	 * @return the wall
	 */
	public Wall getWall() {
		return wall;
	}

	/**
	 * @param wall the wall to set
	 */
	public void setWall(Wall wall) {
		this.wall = wall;
	}

	/**
	 * @return the window
	 */
	public Window [] getWindow() {

		return window;

	}

	/**
	 * @param window the window to set
	 */
	public void setWindow(Window [] window) {

		this.window = window;

	}




}

/**
 *
 */
package patterns.creational.abstractfactory;

/**
 * @author Luigi
 *
 */
public class AlfaSud implements FamilyCar{

	private final int FAMILY_CAR_SPEED_LIMIT = 150;

	private final String INFO = "This is the AlfaSud";


	public String info() {

		return INFO;
	}

	public int speed() {
		return this.FAMILY_CAR_SPEED_LIMIT;
	}

	public void start() {

	}

	public void stop() {

	}

}

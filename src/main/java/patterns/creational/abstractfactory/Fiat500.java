/**
 *
 */
package patterns.creational.abstractfactory;

/**
 * @author Luigi
 *
 */
public class Fiat500 implements FamilyCar{

	private final int FAMILY_CAR_SPEED_LIMIT = 100;

	private final String INFO = "This is the Fiat 500";


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

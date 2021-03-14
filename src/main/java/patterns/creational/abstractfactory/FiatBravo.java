/**
 *
 */
package patterns.creational.abstractfactory;

/**
 * @author Luigi
 *
 */
public class FiatBravo implements SportCar{

	private final int SPORT_CAR_SPEED_LIMIT = 200;

	private final String INFO = "This is the Fiat Bravo";

	private final String [] OPTIONS = {"silver color", "navigator"};


	public String info() {

		return INFO;
	}

	public String [] getOptions() {

		return OPTIONS;
	}

	public int speed() {
		return this.SPORT_CAR_SPEED_LIMIT;
	}

	public void start() {

	}

	public void stop() {

	}

}

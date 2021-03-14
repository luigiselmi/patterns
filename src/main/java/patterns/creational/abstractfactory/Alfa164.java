/**
 *
 */
package patterns.creational.abstractfactory;

/**
 * @author Luigi
 *
 */
public class Alfa164 implements SportCar{

	private final int SPORT_CAR_SPEED_LIMIT = 250;

	private final String INFO = "This is the Alfa164";

	private final String [] OPTIONS = {"gold color", "navigator", "tv"};


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

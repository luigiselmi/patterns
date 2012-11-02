/**
 *
 */
package patterns.behavioral.mediator;

/**
 * @author Luigi
 *
 */
public class ConcreteMediator implements Mediator {

	private Colleague colleague1;

	private Colleague colleague2;

	private double x;

	private double y;

	private double z;

	public void setPosition(double x, double y, double z) {

		this.x = x;

		this.y = y;

		this.z = z;

	}

	public double getX() {

		return x;

	}

	public double getY() {

		return y;

	}

	public double getZ() {

		return z;

	}

}

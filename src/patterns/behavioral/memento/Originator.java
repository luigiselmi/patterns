/**
 *
 */
package patterns.behavioral.memento;

/**
 * @author Luigi
 *
 */
public class Originator {

	/** private-protected variable accessible from a class of the same package */
	double x;

	/** private-protected variable accessible from a class of the same package */
	double y;

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}


}

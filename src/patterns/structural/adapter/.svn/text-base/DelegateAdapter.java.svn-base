/**
 *
 */
package patterns.structural.adapter;

/**
 * @author Luigi
 *
 */
public class DelegateAdapter implements Target{

	private Adaptee adaptee;

	private final int OPEN = 1;

	private final int CLOSED = 0;

	DelegateAdapter() {

		this.adaptee = new Adaptee();

	}

	public int open() {

		int angle = adaptee.turnClockwise();

		return OPEN;

	}

	public int close() {

		int angle = adaptee.turnCounterclockwise();

		return CLOSED;

	}

}

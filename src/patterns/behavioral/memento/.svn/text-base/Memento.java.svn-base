/**
 *
 */
package patterns.behavioral.memento;

/**
 * @author Luigi
 *
 */
public class Memento {

	private Originator originator;

	private double x;

	private double y;

	Memento(Originator originator) {

		this.originator = originator;

		this.x = originator.x;

		this.y = originator.y;


	}


	public void restore() {

		originator.x = x;

		originator.y = y;

	}

}

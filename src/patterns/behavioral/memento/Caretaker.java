/**
 *
 */
package patterns.behavioral.memento;

/**
 * @author Luigi
 *
 */
public class Caretaker {

	private Originator originator;

	private Memento memento;

	Caretaker() {

		originator = new Originator();

	}

	public Originator getOriginator() {

		return originator;

	}

	public void saveOriginatorState() {

		memento = new Memento(originator);

	}

	public void restoreOriginator() {

		memento.restore();

	}

	public static void main(String [] args) {

		Caretaker caretaker = new Caretaker();

		Originator originator = caretaker.getOriginator();

		originator.setX(0.1);

		originator.setY(0.2);

		System.out.println("x = " + originator.getX() + ", y = " + originator.getY());

		caretaker.saveOriginatorState();

		originator.setX(1.0);

		originator.setY(2.0);

		System.out.println("x = " + originator.getX() + ", y = " + originator.getY());

		caretaker.restoreOriginator();

		System.out.println("x = " + originator.getX() + ", y = " + originator.getY());

	}

}

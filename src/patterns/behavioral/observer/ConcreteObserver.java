/**
 *
 */
package patterns.behavioral.observer;

/**
 * @author Luigi
 *
 */
public class ConcreteObserver implements Observer{

	private String name = "";

	ConcreteObserver(String name) {
		this.name = name;
	}

	public void update(String message) {
		System.out.println("Observer " + name + " notified: " + message);
	}
}

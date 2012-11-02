/**
 *
 */
package patterns.behavioral.observer;

/**
 * @author Luigi
 *
 */
public class Manager {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject subject = new Subject();

		ConcreteObserver observer1 = new ConcreteObserver("one");
		ConcreteObserver observer2 = new ConcreteObserver("two");

		subject.addObserver(observer1);
		subject.addObserver(observer2);

		subject.notifyObserver("subject state change");

	}

}

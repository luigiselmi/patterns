/**
 *
 */
package patterns.behavioral.mediator;

/**
 * @author Luigi
 *
 */
public class MediatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mediator mediator = new ConcreteMediator();

		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);

		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

		colleague1.setPosition(0.1, 0.2, 10.0);

		colleague2.printPosition();

	}

}

/**
 *
 */
package patterns.behavioral.mediator;

/**
 * @author Luigi
 *
 */
public class ConcreteColleague2 implements Colleague {

	private Mediator mediator;

	ConcreteColleague2(Mediator mediator) {

		this.mediator = mediator;

	}

	public boolean checkZ() {

		return (mediator.getZ() > 0);

	}

	public void printPosition() {

		if(checkZ()) {

			System.out.println("x = " + mediator.getX() +
							", y = " + mediator.getY() +
							", z = " + mediator.getZ());

		}
		else {

			System.out.println("x = " + mediator.getX() +
					", y = " + mediator.getY() + ", z = unknown");

		}



	}

}

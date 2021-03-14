/**
 *
 */
package patterns.behavioral.mediator;

/**
 * @author Luigi
 *
 */
public class ConcreteColleague1 implements Colleague {

	private Mediator mediator;

	ConcreteColleague1(Mediator mediator) {

		this.mediator = mediator;

	}

	public boolean checkZ() {

		return (mediator.getZ() > 0);

	}

	public void setPosition(double x, double y, double z) {

		if(checkZ()) {

			mediator.setPosition(x, y, z);

		}
		else {

			mediator.setPosition(x, y, 0.0);

		}


	}

}

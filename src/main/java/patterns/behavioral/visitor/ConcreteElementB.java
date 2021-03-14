/**
 *
 */
package patterns.behavioral.visitor;

/**
 * @author Luigi
 *
 */
public class ConcreteElementB implements Element {

	/* (non-Javadoc)
	 * @see patterns.behavioral.visitor.Element#accept(patterns.behavioral.visitor.Visitor)
	 */
	public void operationB() {

		System.out.println("ConcreteElementB: operationB() called.");

	}

	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);

	}

}

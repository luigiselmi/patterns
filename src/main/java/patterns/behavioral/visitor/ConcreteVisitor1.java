/**
 *
 */
package patterns.behavioral.visitor;

/**
 * @author Luigi
 *
 */
public class ConcreteVisitor1 implements Visitor {

	/* (non-Javadoc)
	 * @see patterns.behavioral.visitor.Visitor#visit(patterns.behavioral.visitor.ConcreteElementA)
	 */

	public void visit(ConcreteElementA element) {
		// TODO Auto-generated method stub

		element.operationA();

	}

	/* (non-Javadoc)
	 * @see patterns.behavioral.visitor.Visitor#visit(patterns.behavioral.visitor.ConcreteElementB)
	 */
	public void visit(ConcreteElementB element) {
		// TODO Auto-generated method stub

		element.operationB();

	}

}

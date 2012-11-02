/**
 *
 */
package patterns.behavioral.visitor;

/**
 * @author Luigi
 *
 */
public class VisitorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Element [] element = { new ConcreteElementA(),
								new ConcreteElementA(),
								new ConcreteElementB()};

		Visitor visitor = new ConcreteVisitor1();

		for(int i = 0; i < element.length; i++) {

			element[i].accept(visitor);

		}


	}

}

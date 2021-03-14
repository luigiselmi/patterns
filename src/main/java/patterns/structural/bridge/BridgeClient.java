/**
 *
 */
package patterns.structural.bridge;

/**
 * @author Luigi
 *
 */
public class BridgeClient {

	/**
	 * @param args
	 */
	private final static String OPERATION = "B";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementor implementor;
		Abstraction abstraction;

		if(OPERATION.equals("A")) {

			implementor = new ConcreteImplementorA();

		}
		else {

			implementor = new ConcreteImplementorB();

		}

		abstraction = new RefinedAbstraction(implementor);

		abstraction.operation();


	}

}

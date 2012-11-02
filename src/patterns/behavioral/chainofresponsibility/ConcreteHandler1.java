/**
 *
 */
package patterns.behavioral.chainofresponsibility;

/**
 * @author Luigi
 *
 */
public class ConcreteHandler1 implements Handler{

	private String CONDITION_1 = "one";

	private Handler nextHandler;

	public void handleRequest(String request) throws HandlerException{

		if(CONDITION_1.equals(request)) {

			System.out.println(request + " is 1" );

		}
		else {

			nextHandler = new ConcreteHandler2();

			nextHandler.handleRequest(request);

		}
	}

}

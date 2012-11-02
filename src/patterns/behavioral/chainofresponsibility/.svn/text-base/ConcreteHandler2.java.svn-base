/**
 *
 */
package patterns.behavioral.chainofresponsibility;

/**
 * @author Luigi
 *
 */
public class ConcreteHandler2 implements Handler{

	private String CONDITION_2 = "two";

	public void handleRequest(String request) throws HandlerException{

		if(CONDITION_2.equals(request)) {

			System.out.println(request + " is 2" );

		}
		else {

			throw new HandlerException("No handler for this request.");

		}
	}

}

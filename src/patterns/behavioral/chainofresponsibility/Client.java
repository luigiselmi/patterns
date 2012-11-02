/**
 *
 */
package patterns.behavioral.chainofresponsibility;

/**
 * @author Luigi
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String request = "three"; //no handler for this request
		String request = "two";
		
		/*
		 * Try handlers. If handler1 cannot handle it the request is sent to
		 * handler2. If the last handler cannot handle the request an application exception
		 * is raised.
		 */
		Handler handler = new ConcreteHandler1();

		try {

			handler.handleRequest(request);

		}
		catch (HandlerException he) {

			System.out.println(he.getMessage());

		}




	}

}

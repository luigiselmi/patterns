/**
 *
 */
package patterns.behavioral.state;

/**
 * @author Luigi
 *
 */
public class StateClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectionContext connection = new ConnectionContext();

		connection.closeRequest();
		connection.openRequest();
		connection.openRequest();
		connection.closeRequest();


	}

}

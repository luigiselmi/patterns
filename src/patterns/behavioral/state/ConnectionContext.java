/**
 *
 */
package patterns.behavioral.state;

/**
 * @author Luigi
 *
 */
public class ConnectionContext {


	private ConnectionState currentState;

	private ConnectionEstablished established;

	private ConnectionClosed closed;

	ConnectionContext() {

		established = new ConnectionEstablished();

		closed = new ConnectionClosed();

		currentState = closed;

	}


	public void openRequest() {

		if( currentState.open() ) {

			currentState = established;

		}

	}

	public void closeRequest() {

		if( currentState.close() ) {

			currentState = closed;

		}

	}

}

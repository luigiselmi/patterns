/**
 *
 */
package patterns.behavioral.state;

/**
 * @author Luigi
 *
 */
public class ConnectionEstablished implements ConnectionState {


	public boolean open() {

		System.out.println("connection already open");

		return true;

	}

	public boolean close() {

		System.out.println("closing connection...");

		return false;

	}

}

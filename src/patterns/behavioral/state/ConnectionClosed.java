/**
 *
 */
package patterns.behavioral.state;

/**
 * @author Luigi
 *
 */
public class ConnectionClosed implements ConnectionState {


	public boolean open() {

		System.out.println("opening connection...");

		return true;

	}

	public boolean close() {

		System.out.println("connection already closed");

		return true;

	}

}

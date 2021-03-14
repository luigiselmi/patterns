/**
 *
 */
package patterns.behavioral.chainofresponsibility;

/**
 * @author Luigi
 *
 */
public interface Handler {

	public void handleRequest(String request) throws HandlerException;

}

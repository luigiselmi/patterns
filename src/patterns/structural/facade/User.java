/**
 *
 */
package patterns.structural.facade;

/**
 * @author Luigi
 *
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TopLayerFacade top = new TopLayerFacadeImpl();

		top.write("hello world");

	}

}

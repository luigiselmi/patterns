/**
 *
 */
package patterns.structural.proxy;

/**
 * @author Luigi
 *
 */
public class ProxyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Don't call the real target, call its proxy */
		Proxy target = new Proxy();

		target.request();

	}

}

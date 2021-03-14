/**
 *
 */
package patterns.structural.proxy;

/**
 * @author Luigi
 *
 */
public class Proxy implements Target{

	private RealTarget target;

	public void request(){

		target.request();

	}

}

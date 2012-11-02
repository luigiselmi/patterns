/**
 *
 */
package patterns.structural.flyweight;

/**
 * @author Luigi
 *
 */
public class FlyweightClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /* Don't need the full object, just its extrinsic component,
		    the flyweight.
		 */

		FlyweightFactory factory = new FlyweightFactory();

		Flyweight flyweight = factory.getFlyweight("flyweight");

		flyweight.operation("this is the extrinsic state");


	}

}

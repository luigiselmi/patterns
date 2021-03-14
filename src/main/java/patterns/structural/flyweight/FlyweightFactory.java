/**
 *
 */
package patterns.structural.flyweight;

/**
 * @author Luigi
 *
 */
public class FlyweightFactory {

	private final String KEY = "flyweight";

	private Flyweight flyweight;

	public Flyweight getFlyweight(String key) {

		if(KEY.equals(key)) {
			flyweight = new ConcreteFlyweight();
		}
		else {

			flyweight = new UnsharedConcreteFlyweight();

		}

		return flyweight;

	}

}

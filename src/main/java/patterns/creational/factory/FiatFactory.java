/**
 *
 */
package patterns.creational.factory;

/**
 * @author Luigi
 *
 */
public class FiatFactory extends CarFactory{

	Engine createEngine(){
		return (Engine) new FiatEngine();
	}

}

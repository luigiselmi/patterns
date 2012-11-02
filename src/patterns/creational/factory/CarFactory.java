/**
 *
 */
package patterns.creational.factory;

/**
 * @author Luigi
 * @version 0.1
 *
 */
public abstract class CarFactory {

	abstract Engine createEngine();

	protected String getEngineInfo(){

		return this.createEngine().info();
	}

}

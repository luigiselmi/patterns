/**
 *
 */
package patterns.creational.factory;

/**
 * @author Luigi
 *@version 0.1
 */
public class AlfaFactory extends CarFactory{
	
	Engine createEngine(){
		return (Engine) new AlfaEngine();
	}

}

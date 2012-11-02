/**
 *
 */
package patterns.creational.prototype;

/**
 * @author Luigi
 *
 */
public class FiatCar implements Car{

	public void start(){
		System.out.println("The car has started");
	}

	public void stop(){
		System.out.println("The car has stopped");
	}

	public String info(){
		return "This is a Fiat Car";
	}

}

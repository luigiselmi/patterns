/**
 *
 */
package patterns.creational.prototype;

/**
 * @author Luigi
 *
 */
public class AlfaCar implements Car{

	public void start(){
		System.out.println("The car has started");
	}

	public void stop(){
		System.out.println("The car has stopped");
	}

	public String info(){
		return "This is an Alfa Car";
	}

}

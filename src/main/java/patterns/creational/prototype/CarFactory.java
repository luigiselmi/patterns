/**
 *
 */
package patterns.creational.prototype;

/**
 * @author Luigi
 *
 */
public class CarFactory {


	public Car createCar(String className) {

		Car car = null;

		try {

			Class c = Class.forName(className);
			car = (Car) c.newInstance();


		}
		catch (ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		catch (InstantiationException ie){
			ie.printStackTrace();
		}
		catch (IllegalAccessException iae){
			iae.printStackTrace();
		}

		return car;
	}
}

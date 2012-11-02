/**
 *
 */
package patterns.creational.abstractfactory;

/**
 * @author Luigi
 *
 */
public class FiatFactory implements CarFactory{

	public SportCar createSportCar(){

		return new FiatBravo();
	}

	public FamilyCar createFamilyCar(){

		return new Fiat500();

	}
}

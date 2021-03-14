/**
 *
 */
package patterns.creational.abstractfactory;

/**
 * @author Luigi
 *
 */
public interface CarFactory {

	public SportCar createSportCar();

	public FamilyCar createFamilyCar();

}

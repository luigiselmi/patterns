/**
 *
 */
package patterns.creational.abstractfactory;

/**
 * @author Luigi
 *
 */
public class CarBuyer {

	/**
	 * @param args
	 */
	private final String FIAT = "fiat";
	private final String ALFA = "alfa";



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		AlfaFactory alfafactory = new AlfaFactory();
		FiatFactory fiatfactory = new FiatFactory();

		FamilyCar [] familycar = { alfafactory.createFamilyCar(), fiatfactory.createFamilyCar()};

		for(int i = 0; i < familycar.length; i++) {

			System.out.println(familycar[i].info() + ". Its speed is: " + familycar[i].speed() + " Km/h");

		}

		SportCar [] sportcar = {alfafactory.createSportCar(), fiatfactory.createSportCar()};

		for(int i = 0; i < sportcar.length; i++) {

			System.out.println(sportcar[i].info() + ". Its speed is: " + sportcar[i].speed() + " Km/h");
			System.out.println("It has the following optional:");
			for(int j = 0; j < sportcar[i].getOptions().length; j++) {

				System.out.println(sportcar[i].getOptions()[j]);

			}

		}


	}

}

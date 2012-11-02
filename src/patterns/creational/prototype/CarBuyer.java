/**
 *
 */
package patterns.creational.prototype;

/**
 * @author Luigi
 *
 */
public class CarBuyer {

	/**
	 * @param args
	 */
	private static final String FIAT_CLASS = "patterns.creational.prototype.FiatCar";
	private static final String ALFA_CLASS = "patterns.creational.prototype.AlfaCar";

	public void getCar(String carModel){
		CarFactory factory = new CarFactory();
		Car car = factory.createCar(carModel);
		if(! (car == null) ){
			System.out.println(car.info());
			car.start();
			car.stop();
		}
		else{
			System.out.println("No cars available");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarBuyer buyer = new CarBuyer();
		buyer.getCar(FIAT_CLASS);

	}

}

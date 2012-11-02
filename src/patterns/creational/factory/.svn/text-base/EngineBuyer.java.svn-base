/**
 *
 */
package patterns.creational.factory;

/**
 * @author Luigi
 *
 */
public class EngineBuyer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EngineBuyer buyer = new EngineBuyer() ;
		buyer.start() ;

	}
	
	public void start() {
		CarFactory factory;
		String chooseFactory = "alfa";
		if(chooseFactory.equals("alfa")){
			factory = new AlfaFactory();
		}
		else {
			factory = new FiatFactory();
		}

		System.out.println(factory.getEngineInfo());
		
		Engine engine = factory.createEngine();
		engine.start();
		engine.stop();

	}

}

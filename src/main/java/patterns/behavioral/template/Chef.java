package patterns.behavioral.template;
import java.util.logging.*;
/**
 * A template method defines the skeleton of a process. 
 * Use the concrete class thath implements the methods used in the
 * xyz algorithm defined in the AbstarctClass class.
 * @author Luigi
 * @version 0.1
 */
public class Chef {

	/**
	 * @param args
	 */

	public String makeRecipe(){
		Logger logger = Logger.getLogger(getClass().getName());
		PastaRecipe pastaWithTomato = new PastaRecipe();
		return pastaWithTomato.procedure();
	}

	public static void main(String[] args) {


		Chef chef = new Chef();
		System.out.println(chef.makeRecipe());

	}

}

/**
 *
 */
package patterns.structural.decorator;

/**
 * This is the object whose behaviour we want modify
 * @author Luigi
 *
 */
public class PlainTextPrinter implements AbstractPrinter{

	public void print(String statement) {

		System.out.println(statement);

	}

}

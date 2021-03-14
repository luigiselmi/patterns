/**
 *
 */
package patterns.structural.decorator;

/**
 * This class is a decorator for the PlainTextPrinter class.
 * @author Luigi
 *
 */
public class HTMLPrinterDecorator implements AbstractPrinter{

	private final String HEADER = "<html><body><h2>";

	private final String FOOTER = "</h2></body></html>";

	AbstractPrinter printer;

	HTMLPrinterDecorator(AbstractPrinter printer) {

		this.printer = printer;

	}

	public void print(String statement) {

		printer.print(HEADER + statement + FOOTER);

	}

}

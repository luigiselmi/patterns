/**
 *
 */
package patterns.structural.decorator;

/**
 * This class is a decorator for the PlainTextPrinter class.
 * @author Luigi
 *
 */
public class XMLPrinterDecorator implements AbstractPrinter{

	private final String HEADER = "<?xml version=\"1.0\"><stmt>";

	private final String FOOTER = "</stmt>";

	AbstractPrinter printer;

	XMLPrinterDecorator(AbstractPrinter printer) {

		this.printer = printer;

	}

	public void print(String statement) {

		printer.print(HEADER + statement + FOOTER);

	}

}

/**
 *
 */
package patterns.structural.decorator;

/**
 * @author Luigi
 *
 */
public class DecoratorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String statement = "Some assertions about the World";

		PlainTextPrinter text = new PlainTextPrinter();

		/** Print in plain text */
		text.print(statement);

		/* Put the text in to an html before sending it to a browser */
		HTMLPrinterDecorator html = new HTMLPrinterDecorator(text);
		html.print(statement);

		/* Put the text into an xml before sendig it to an xml parser */
		XMLPrinterDecorator xml = new XMLPrinterDecorator(text);
		xml.print(statement);



	}

}

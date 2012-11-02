/**
 *
 */
package patterns.structural.facade;

/**
 * @author Luigi
 *
 */
public class BottomlLayerFacadeImpl implements BottomLayerFacade{

	private final String HEADER = "<BOTTOM-STACK>";

	private final String FOOTER = "</BOTTOM-STACK>";

	private BottomLayerWriter writer;

	BottomlLayerFacadeImpl() {

		writer = new BottomLayerWriter();

	}


	public void write(String message) {

		writer.write(HEADER + message + FOOTER);

	}

}

/**
 *
 */
package patterns.structural.facade;

/**
 * @author Luigi
 *
 */
public class TopLayerFacadeImpl implements TopLayerFacade{

	private final String HEADER = "<TOP-STACK>";

	private final String FOOTER = "</TOP-STACK>";

	private TopLayerWriter writer;

	TopLayerFacadeImpl() {

		writer = new TopLayerWriter();

	}

	public void write(String message) {

		writer.write(HEADER + message + FOOTER);
	}



}

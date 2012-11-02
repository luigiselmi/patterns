package patterns.structural.facade;
/**
 *
 */

/**
 * @author Luigi
 *
 */
public class TopLayerWriter {

	BottomLayerFacade physicalLayer;

	TopLayerWriter() {

		physicalLayer = new BottomlLayerFacadeImpl();

	}

	public void write(String message) {

		physicalLayer.write(message);

	}

}

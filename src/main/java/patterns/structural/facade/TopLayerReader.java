/**
 *
 */
package patterns.structural.facade;

/**
 * @author Luigi
 *
 */
public class TopLayerReader {

	BottomLayerFacade bottomLayer;

	TopLayerReader() {

		bottomLayer = new BottomlLayerFacadeImpl();

	}



}

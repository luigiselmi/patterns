/**
 *
 */
package patterns.behavioral.template;

import java.util.logging.Logger;

/**
 * This class defines the algorithm xyz to show the Template method pattern. It is composed of three steps that
 * must be implemented by a subclass.
 *
 * @author Luigi
 * @version 0.1
 *
 */
public abstract class Recipe {
	/**
	 * Run the xyz algorithm
	 */
	protected final Logger logger = Logger.getLogger(getClass().getName());

	protected final String procedure(){
		StringBuffer resultBuffer = new StringBuffer();
		resultBuffer.append(chooseIngredients());
		resultBuffer.append(cook());
		resultBuffer.append(serve());

		logger.fine("Algorithm performed well");
		return resultBuffer.toString();

	}

	/** First step of the xyz algorithm */
	abstract String chooseIngredients();
	/** Second step of the xyz algorithm */
	abstract String cook();
	/** Third step of the xyz algorithm */
	abstract String serve();
}

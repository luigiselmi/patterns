/**
 *Can be "true" or "false"
 *
 */
package patterns.behavioral.interpreter;

/**
 * @author Luigi
 *
 */
public class AtomicFormula implements AbstractFormula{

	private Boolean atomic;

	AtomicFormula(boolean atomic) {

		this.atomic = new Boolean(atomic);
	}

	public void interpret(Context context) {



	}

}

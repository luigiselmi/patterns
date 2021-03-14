/**
 * Our language has two terms and an operator. The term are {true, false}
 * The operator is ^ which represent the logical AND operator. The expression
 * must be well-formed as stated by propositional logic
 *
 */
package patterns.behavioral.interpreter;

import java.util.*;

/**
 * @author Luigi
 *
 */
public interface AbstractFormula {

	public void interpret(Context context);

}

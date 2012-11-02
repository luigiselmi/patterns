/**
 *
 */
package patterns.behavioral.interpreter;

import java.util.*;

/**
 * @author Luigi
 *
 */
public class Context {

	private Stack<String> stack;

	Context() {

		stack = new Stack<String>();

	}


	public void push(String item) {

		stack.push(item);

	}

	public void pop() {

		stack.pop();

	}


}

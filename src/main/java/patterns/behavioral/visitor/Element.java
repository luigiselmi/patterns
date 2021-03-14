/**
 *
 */
package patterns.behavioral.visitor;

/**
 * @author Luigi
 *
 */
public interface Element {

	public void accept(Visitor visitor);

}

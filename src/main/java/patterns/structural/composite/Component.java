/**
 *
 */
package patterns.structural.composite;

/**
 * @author Luigi
 *
 */
public abstract class Component {

	public abstract int numberOfComponents();

	public abstract void showComponents();

	public abstract String type();

	public abstract String name();

	public abstract void addComponent(Component component)  throws LeafException;

	public abstract Component getChild(int childId) throws LeafException;

	public abstract Component [] getChildren() throws LeafException;

}

/**
 *
 */
package patterns.structural.composite;

/**
 * @author Luigi
 *
 */
public class Leaf extends Component{

	private final int NUMBER_OF_COMPONENTS = 0;

	private final static String TYPE = "Leaf";

	private String name;


	Leaf(String name) {

		this.name = name;

	}

	public String name() {

		return this.name;

	}


	public int numberOfComponents() {

		return NUMBER_OF_COMPONENTS;

	}

	public void showComponents() {

		System.out.println(name + ":" + TYPE);

	}

	public String type() {

		return TYPE;

	}

	public void addComponent(Component component) throws LeafException {
		throw new LeafException("Leafs cannot have components");
	}

	public Component getChild(int childId) throws LeafException {
		throw new LeafException("Leafs do not have components");
	}

	public Component [] getChildren() throws LeafException {
		throw new LeafException("Leafs do not have components");
	}

}

/**
 *
 */
package patterns.structural.composite;

/**
 * @author Luigi
 *
 */
public class Composite extends Component{

	private final String TYPE = "Composite";

	private Component [] component;

	/** Number of all subcomponents */
	private int numberOfComponents = 0;

	private int total = 0;

	private String name;


	Composite(String name) {

		this.name = name;

	}

	/**
	 *  Gives the name of the component as set at runtime in the constructor
	 *
	 */
	public String name() {

		return name;

	}

	/**
	 * Gives the number of all the components at whatever level they are.
	 */
	public int numberOfComponents() {

		return numberOfComponents;

	}


	/**
	 * Prints name and type of the component and of its parts recursively.
	 */
	public void showComponents() {


		System.out.println(name + ":" + TYPE);


		for(int i = 0; i < component.length; i++) {

			component[i].showComponents();

		}

	}

	/**
	 * Adds one component to the composite and stores it in an array. Every time a new
	 * component is added creates a new array and puts the old components and the new one
	 * in it. Before leaving updates the number of the components.
	 *
	 */
	public void addComponent(Component newComponent) {

		if( component == null ) {

			component = new Component[1];

			component[0] = newComponent;
		}
		else {

			int newSize = 1 + component.length;

			Component [] newComponentList = new Component[newSize];

			for(int i = 0; i < component.length ; i++ ) {

				newComponentList[i] = component[i];

			}

			newComponentList[newSize - 1] = newComponent;


			component = newComponentList;


		}

		numberOfComponents += 1 + newComponent.numberOfComponents();

	}

	/**
	 * Returns the child in the array with the id passed as a parameter.
	 */
	public Component getChild(int childId) {

		return component[childId];

	}

	/**
	 * Returns all the components
	 */
	public Component [] getChildren() {

		return component;

	}

	/**
	 *  Returns the type of the component (Composite)
	 *
	 */
	public String type() {

		return TYPE;

	}

}

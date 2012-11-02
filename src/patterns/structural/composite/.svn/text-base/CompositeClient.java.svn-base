/**
 *
 */
package patterns.structural.composite;

/**
 * @author Luigi
 *
 */
public class CompositeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component tree = new Composite("tree");

		Component branch1 = new Composite("branch1");
		Component leaf11 = new Leaf("leaf11");
		Component leaf12 = new Leaf("leaf12");

		Component branch2 = new Composite("branch2");
		Component leaf21 = new Leaf("leaf21");
		Component leaf22 = new Leaf("leaf22");


		try {


			branch1.addComponent(leaf11);


			branch1.addComponent(leaf12);


			branch2.addComponent(leaf21);
			branch2.addComponent(leaf22);

			branch1.addComponent(branch2);
			tree.addComponent(branch1);


		}
		catch(LeafException le) {

			System.out.println(le.getMessage());

		}


		//System.out.println("Number of " + branch2.name() + "'s components: " + branch2.numberOfComponents());


		tree.showComponents();




	}



}

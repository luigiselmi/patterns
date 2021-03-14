/**
 *
 */
package patterns.structural.adapter;

/**
 * @author Luigi
 *
 */
public class AdapterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Target target = new DelegateAdapter();

		System.out.println(target.open());

		System.out.println(target.close());

	}

}

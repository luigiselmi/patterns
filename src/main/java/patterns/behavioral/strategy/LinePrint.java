/**
 *
 */
package patterns.behavioral.strategy;

/**
 * @author Luigi
 *
 */
public class LinePrint implements PrintStrategy{

	public void print(String [] words) {

		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");

		}


		System.out.println();

	}

}

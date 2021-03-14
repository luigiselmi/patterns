/**
 *
 */
package patterns.behavioral.iterator;

import java.util.*;
/**
 * @author Luigi
 *
 */
public class IteratorClient {

	public static void main(String [] args) {

		List myList = new ArrayList();

		myList.add("Pippo");
		myList.add("Pluto");
		myList.add("Paperino");

		Aggregate aggregate = new ConcreteAggregate(myList);

		Iterator iterator = new ConcreteIterator(aggregate);

		System.out.println("First object: " + iterator.first());

		while(iterator.hasMoreElements()) {

			System.out.println(iterator.next());
		}


	}

}

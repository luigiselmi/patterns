/**
 *
 */
package patterns.behavioral.iterator;

import java.util.*;
/**
 * @author Luigi
 *
 */
public class ConcreteIterator implements Iterator{

	private Aggregate aggregate;

	private int currentIndex = 0;

	ConcreteIterator(Aggregate aggregate) {

		this.aggregate = aggregate;

	}

	public Object first() {

		return aggregate.get(0);

	}

	public Object next() {

		return aggregate.get(currentIndex++);

	}

	public Object current() {

		return aggregate.get(currentIndex);

	}

	public boolean hasMoreElements() {

		return ( currentIndex < aggregate.size() );

	}

}

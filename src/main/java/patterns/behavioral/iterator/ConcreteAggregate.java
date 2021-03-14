/**
 *
 */
package patterns.behavioral.iterator;

import java.util.*;

/**
 * @author Luigi
 *
 */
public class ConcreteAggregate implements Aggregate{

	private List list;

	ConcreteAggregate(List list) {

		this.list = list;
	}

	public Iterator createIterator() {

		return (Iterator) new ConcreteIterator(this);

	}

	public int size() {

		return list.size();

	}

	public Object get(int index) {

		return list.get(index);

	}

}

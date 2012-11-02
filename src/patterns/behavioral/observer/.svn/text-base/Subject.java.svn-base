/**
 *
 */
package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Luigi
 *
 */
public class Subject {

	ArrayList observerList = new ArrayList();

	public void addObserver(Observer observer) {

		observerList.add(observer);

	}

	public void removeObserver(Observer observer) {

		observerList.remove(observer);

	}

	public void notifyObserver(String message) {

		Iterator iterator = observerList.iterator();
		while(iterator.hasNext()) {
			Observer observer = (Observer) iterator.next();
			observer.update(message);
		}


	}

}

/**
 *
 */
package patterns.creational.singleton;

import junit.framework.TestCase;

/**
 * @author Luigi
 *
 */
public class WifeTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	private Wife firstWife;
	private final String HUSBAND_PROMISE = "I will love you for ever!";

	protected void setUp() throws Exception {
		super.setUp();
		firstWife = Wife.getInstance();
		firstWife.makePromiseForLife(HUSBAND_PROMISE);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testFirstWords(){
		assertTrue(HUSBAND_PROMISE.equals(firstWife.getHusbandPromiseFromMemory()));
	}

}

package patterns.behavioral.template;

import patterns.behavioral.template.ConcreteClass;
import junit.framework.TestCase;

public class UseTemplateMethodTest extends TestCase {

	private ConcreteClass concrete;

	protected void setUp() throws Exception {
		concrete = new ConcreteClass();
	}

	protected void tearDown() throws Exception {
	}

	public void testRunTemplateMethod() {
		//Results to be asserted true
		String RUN_TEMPLATE_METHOD_MESSAGE = "This is method1()This is method2()This is method3()";
		//fail("Not yet implemented");

		String result = concrete.templateMethod();
		assertTrue( RUN_TEMPLATE_METHOD_MESSAGE.equals(result) );
	}

	public void testToString() {
		// Results to be asserted true
		String TO_STRING_MESSAGE = "patterns.behavioral.template.ConcreteClass: no more info";

		assertTrue(TO_STRING_MESSAGE.equals(concrete.toString()));
	}

}

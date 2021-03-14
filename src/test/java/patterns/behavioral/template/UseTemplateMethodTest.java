package patterns.behavioral.template;

import patterns.behavioral.template.PastaRecipe;
import junit.framework.TestCase;

public class UseTemplateMethodTest extends TestCase {

	private Recipe concrete;

	protected void setUp() throws Exception {
		concrete = new PastaRecipe();
	}

	public void testRunTemplateMethod() {
		//Results to be asserted true
		String RUN_TEMPLATE_METHOD_MESSAGE = "Ingredients: pasta, tomato, salt, olive oil, parmisan cheese\n";
		//fail("Not yet implemented");

		String result = concrete.chooseIngredients();
		assertTrue( RUN_TEMPLATE_METHOD_MESSAGE.equals(result) );
	}

}

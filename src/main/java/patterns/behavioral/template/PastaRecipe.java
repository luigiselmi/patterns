package patterns.behavioral.template;
/**
 * Implements the steps of the xyz algorithm of the superclass
 * @author Luigi
 * @version 0.1
 *
 */
public class PastaRecipe extends Recipe{
	public String chooseIngredients(){
		String result = "Ingredients: pasta, tomato, salt, olive oil, parmisan cheese\n";
		return result;
	}

	public String cook(){
		String result = "Cooking: put pasta in boiling water and cook tomato with salt and oil\n";
		return result;
	}

	public String serve(){
		String result = "Put the tomato souce onto the pasta and serve with parmisan cheese\n";
		return result;
	}

	public String toString(){
		StringBuffer buffer = new StringBuffer(getClass().getName() + ": ");
		buffer.append("no more info");
		return buffer.toString();
	}
}

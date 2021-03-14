package patterns.behavioral.template;
/**
 * Implements the steps of the xyz algorithm of the superclass
 * @author Luigi
 * @version 0.1
 *
 */
public class PastaRecipe extends Recipe{
	public String chooseIngredients(){
		return "Ingredients: pasta, tomato, salt, olive oil, parmisan cheese\n";
	}

	public String cook(){
		return "Cooking: put pasta in boiling water and cook tomato with salt and oil\n";
	}

	public String serve(){
		return "Put the tomato souce onto the pasta and serve with parmisan cheese\n";
	}

	public String toString(){
		StringBuffer buffer = new StringBuffer(getClass().getName() + ": ");
		buffer.append("no more info");
		return buffer.toString();
	}
}

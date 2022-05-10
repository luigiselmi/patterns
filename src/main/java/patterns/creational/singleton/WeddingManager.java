package patterns.creational.singleton;

/**
 * The Wife class is istantiated, she is the wife of a man.
 * The man makes a promise, that is, sends a message to his wife.
 * The manager 
 * @author Luigi
 * @version 0.1
 */
public class WeddingManager {

	
  public static void main(String[] args) {
		
	Wife firstWife, secondWife;
	String HUSBAND_PROMISE = "I will love you for ever!";
	
	firstWife = Wife.getInstance();
	
	if(firstWife != null) 
		System.out.println("An instance of wife is started.");
	else
		System.out.println("There's no instance of Wife.");

	System.out.println("Her husband make a promise: " + HUSBAND_PROMISE);
	firstWife.makePromiseForLife(HUSBAND_PROMISE);
	
	System.out.println("Some years later the man asks his wife what was his promise and her answer is:");
	
	secondWife = Wife.getInstance();
	if(secondWife != null) 
	    System.out.println("\"" + secondWife.getHusbandPromiseFromMemory() + "\"");
	
  }

}

package patterns.creational.singleton;

/**
 * A man ask a Wedding Manager for more wifes. Look at what he gets. :)
 * @author Luigi
 *@version 0.1
 */
public class WeddingManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 TODO code application logic here
        Wife firstWife, secondWife;
        String HUSBAND_PROMISE = "I will love you for ever!";

        System.out.println("Trying to get married...");
        firstWife = Wife.getInstance();
        //Tell you'll love her for ever
        firstWife.makePromiseForLife(HUSBAND_PROMISE);
        if(firstWife != null)
        {

            System.out.println("Do not forget your promise: " + firstWife.getHusbandPromiseFromMemory());
        }

        System.out.println("Trying to get married twice...");
        secondWife = Wife.getInstance();
        if(secondWife != null)
        {
            System.out.println("You liar, bastard! I am your only wife. Did you forget your promise ? \"" + secondWife.getHusbandPromiseFromMemory() + "\"");
        }



	}

}

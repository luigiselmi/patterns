/**
 *
 */
package patterns.creational.singleton;

/**
 * This shows the singleton pattern: you can have just a wife in your life!
 *
 * @author Luigi
 *@version 0.1
 */
public class Wife {


	private String promise;

    /** Creates a new instance of Wife */
	private static final Wife wife = new Wife();

	/** Private constructor */
    private Wife() {
    }

    /** Acces the static instance of wife */
    public static Wife getInstance(){

    	return wife;
    }

    public String getHusbandPromiseFromMemory()
    {
        return promise;
    }

    public void makePromiseForLife(String promise){
    	this.promise = promise;
    }
}

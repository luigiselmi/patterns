/**
 *
 */
package patterns.behavioral.strategy;

/**
 * @author Luigi
 *
 */
public class PrintContext {

	private PrintStrategy strategy;

	public void setLinePrint() {

		this.strategy = new LinePrint();
	}

	public void setVerticalPrint(){
		this.strategy = new VerticalPrint();
	}

	public void print(String [] words){
		if ( strategy != null){
			strategy.print(words);
		}
		else {
			System.out.println("Set the printing mode.");
		}

	}

}

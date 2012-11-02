/**
 *
 */
package patterns.behavioral.command;

/**
 * This is the Invoker in the Command Pattern
 * @author Luigi
 *
 */
public class Switch {

	private Command commandOn, commandOff;

	Switch(Command commandOn, Command commandOff){
		this.commandOn = commandOn;
		this.commandOff = commandOff;
	}

	public void on(){
		commandOn.execute();
	}

	public void off(){
		commandOff.execute();
	}


}

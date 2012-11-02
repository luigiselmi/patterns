/**
 *
 */
package patterns.behavioral.command;

/**
 * @author Luigi
 *
 */
public class LightOn implements Command{

	Light light;

	LightOn(Light light){
		this.light = light;
	}

	public void execute(){
		light.lightOn();
	}
}

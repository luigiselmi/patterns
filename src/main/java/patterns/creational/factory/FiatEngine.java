package patterns.creational.factory;

public class FiatEngine implements Engine{
	public void start(){
		System.out.println("The FIAT Engine doesn't start");
	}
	public void stop(){
		System.out.println("The FIAT Engine never started");
	}
	public String info(){
		return "This is a Fiat engine";
	}
}

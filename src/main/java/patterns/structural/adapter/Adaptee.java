package patterns.structural.adapter;

public class Adaptee {

	private final int CLOCKWISE = 90;

	private final int COUNTERCLOCKWISE = -90;

	public int turnClockwise() {

		return CLOCKWISE;

	}

	public int turnCounterclockwise() {

		return COUNTERCLOCKWISE;

	}

}

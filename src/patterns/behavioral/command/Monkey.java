/**
 *
 */
package patterns.behavioral.command;

/**
 * @author Luigi
 *
 */
public class Monkey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is one object, a light
		Light mylight = new Light();
		// These are the commands the client can use
		LightOn lighton = new LightOn(mylight);
		LightOff lightoff = new LightOff(mylight);

		// This is another object, a game board
		GameBoard board = new GameBoard();
		// These are the commands the client can use
		GameBoardOn boardon = new GameBoardOn(board);
		GameBoardOff boardoff = new GameBoardOff(board);

		// This is the light interface the client can act upon
		Switch lightswitch = new Switch(lighton, lightoff);
		lightswitch.on();
		lightswitch.off();

		// This is the board interface the client can act upon
		Switch boardswitch = new Switch(boardon, boardoff);
		boardswitch.on();
		boardswitch.off();

	}

}

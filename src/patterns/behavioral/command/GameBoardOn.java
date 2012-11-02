/**
 *
 */
package patterns.behavioral.command;

/**
 * @author Luigi
 *
 */
public class GameBoardOn implements Command{

	GameBoard board;

	GameBoardOn(GameBoard board){
		this.board = board;
	}

	public void execute(){
		board.gameBoardOn();
	}

}

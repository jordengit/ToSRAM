package tosram.algorithm;

import java.util.List;

import tosram.Direction;
import tosram.MutableRuneMap;

/**
 * A <code>PathConstrain</code> that forbids direct u-turn.
 * 
 * @author johnchen902
 */
public class NoUTurnPathConstrain implements PathConstrain {

	@Override
	public boolean canStart(int startingX, int startingY, MutableRuneMap map) {
		return true;
	}

	@Override
	public boolean canMove(int startingX, int startingY,
			List<Direction> directions, Direction direction, int resultingX,
			int resultingY, MutableRuneMap map) {
		return directions.isEmpty()
				|| directions.get(directions.size() - 1).getOppsite() != direction;
	}
}

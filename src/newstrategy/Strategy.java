package newstrategy;

import local.round.*;

public interface Strategy {
	public Choice getChoice(Player currentPlayer, Player otherPlayer);
}

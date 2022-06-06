package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game,Campaign campaign);
	void sell(Game game,Gamer gamer,Campaign campaign);
}

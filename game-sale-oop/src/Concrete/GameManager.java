package Concrete;

import Abstract.GameService;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		
		System.out.println("Game added : "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted : "+game.getName());
		
	}

	@Override
	public void update(Game game,Campaign campaign) {
		System.out.println(game.getName()+"updated to"+campaign.getName());
	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName()+"sold to "+gamer.getFirstName()+game.getPrice()+"with "+campaign.getName());
		
	}

}

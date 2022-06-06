package Main;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer("1","Dogukan","Kisecuklu","30031999");
		Campaign campaign = new Campaign("Sale",10);
		Game game = new Game("Last of Us",20);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		
		
		
	}

}

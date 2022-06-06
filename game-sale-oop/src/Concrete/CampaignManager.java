package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" added to the campaign system");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" deleted to the campaign system");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" updated the campaign system");
		
	}

}

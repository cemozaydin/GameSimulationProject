package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklenmiştir.\n" + "Kampanya Adı : " + campaign.getCampaignName() + "\n");
		
	}

	@Override
	public void list(Campaign[] campaigns) {
		System.out.println("**** Kampanya Listesi *****");
		System.out.println("ID     | " + "        Kampanya Adı                 | " + "   İndirim Oranı   |  " + " Kampanya Bitiş Tarihi   |");
		for(Campaign campaign:campaigns) {
			System.out.println(campaign.getId() + "      " + campaign.getCampaignName() + "   " + campaign.getDiscountRate() + "  " + campaign.getCampaignFinishDate());
		}
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellenmiştir.\n" + "Kampanya Adı : " + campaign.getCampaignName() + "\n");		
	}

}

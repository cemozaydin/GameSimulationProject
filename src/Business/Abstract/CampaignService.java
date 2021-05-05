package Business.Abstract;

import Entities.Concrete.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void list(Campaign[] campaigns);
	void update(Campaign campaign);
	
}

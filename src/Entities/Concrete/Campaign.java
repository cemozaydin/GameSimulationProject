package Entities.Concrete;
import Entities.Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private double discountRate;
	private String campaignStartDate;
	private String campaignFinishDate;
	
	
	
	public Campaign() {
		
	}

	
	public Campaign(int id, String campaignName, double discountRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}


	public Campaign(int id, String campaignName, double discountRate, String campaignStartDate, String campaignFinishDate) {
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.campaignStartDate = campaignStartDate;
		this.campaignFinishDate = campaignFinishDate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(String campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	public String getCampaignFinishDate() {
		return campaignFinishDate;
	}
	public void setCampaignFinishDate(String campaignFinishDate) {
		this.campaignFinishDate = campaignFinishDate;
	}
	
	

}

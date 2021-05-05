package Entities.Concrete;
import java.time.LocalDateTime;

import Entities.Abstract.Entity;

public class Order implements Entity{
	private int id;
	private LocalDateTime orderTime;
	private Game game;
	private Campaign campaign;
	private double totalPrice;
	
	public Order(int id, Game game, Campaign campaign) {
		super();
		this.id = id;
		this.game = game;
		this.campaign = campaign;
		this.orderTime = LocalDateTime.now();
		this.totalPrice = game.getGamePrice() - (game.getGamePrice()*campaign.getDiscountRate()/100);
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	}	
	


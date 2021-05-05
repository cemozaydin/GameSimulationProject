package Business.Concrete;

import Business.Abstract.OrderService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Order;
import Entities.Concrete.User;

public class OrderManager implements OrderService{

	@Override
	public void add(User user, Order order) {
		
		System.out.println("...Satış işlemi Başarılı...");
		System.out.println("Müşteri 		: " + user.getFirstName() + " " + user.getLastName());
		System.out.println("Oyun    		: " + order.getGame().getGameName());
		System.out.println("Fiyat   		: " + order.getGame().getGamePrice());
		System.out.println("Kampanya		: " + order.getCampaign().getCampaignName());
		System.out.println("İndirim Oranı	: " + order.getCampaign().getDiscountRate());
		System.out.println("Toplam Tutar    : " + order.getTotalPrice());
	}

	@Override
	public void list(Order[] orders) {
		System.out.println("~~~~~~~~~~  SATIŞ LİSTESİ ~~~~~~~~~~");
		for(Order order:orders) {
			System.out.println(order.getId()  + " - " + order.getGame().getGameName());
		}
		
	}

}

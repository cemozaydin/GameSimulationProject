import java.util.Scanner;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.OrderManager;
import Business.Concrete.UserManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Order;
import Entities.Concrete.User;
import adapters.UserValidationManager;

public class Main {

	public static void main(String[] args) {
		 
		int secim;
		boolean _loop = true;
		Scanner scn = new Scanner(System.in);		
		
		UserManager userManager = new UserManager(new UserValidationManager());
		User user1= new User(1,"Cem","Özaydın","11111111111",1980);
		User user2=new User(2,"Esra","Aydın","111111111111",1983);	
		
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign(1,"  Covid - Evde Kal Türkiye  ",12, "01-05-2021", "05-05-2021");		
		Campaign campaign2 = new Campaign(2,"Bahara Merhaba İndirim Şöleni",14,"01-05-2021", "05-06-2021");		
		Campaign[] campaigns = {campaign1,campaign2};
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1,"Call Of Duty-Modern Warfare",350);
		Game game2 = new Game(2,"PES 2021",300);
		Game[] games = {game1,game2};
		
		OrderManager orderManager = new OrderManager();
		Order order1 = new Order(1, game1, campaign2);
		Order order2 = new Order(2, game2, campaign1);
		Order[] orders = {order1,order2};
		
		
		do 
		{			
		    System.out.println();		    
		    
			System.out.println("__________ Game Simulation Project __________");
			System.out.println();
			System.out.println("1.  Kullanıcı Ekleme");
			System.out.println("2.  Kullanıcı Listeleme");
			System.out.println("3.  Kullanıcı Güncelleme");
			System.out.println("4.  Kullanıcı Silme");
			System.out.println();
			System.out.println("5.  Oyun Ekleme");
			System.out.println("6.  Oyun Listeleme");
			System.out.println("7.  Oyun Güncelleme");
			System.out.println("8.  Oyun Silme");
			System.out.println();
			System.out.println("9.  Kampanya Ekleme");
			System.out.println("10. Kampanya Listeleme");
			System.out.println("11. Kampanya Güncelleme");
			System.out.println();
			System.out.println("12. Yeni Satış");
			System.out.println("13. Satış Listeleme");
			System.out.println();
			System.out.println("14. ÇIKIŞ");
			System.out.println();
			System.out.print("Seçiminiz <1-14> : ");			
			secim = Integer.parseInt(scn.nextLine());
			System.out.println();
	
		
			switch (secim) {
			case 1:					
				userManager.add(user1);
				userManager.add(user2);	
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 2:				
				User[] users= {user1,user2};	
				userManager.list(users);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 3:
				userManager.update(user2);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 4:
				userManager.delete(user1);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 5:
				gameManager.add(game1);
				gameManager.add(game2);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 6:
				gameManager.list(games);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 7:
				gameManager.update(game2);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 8:
				gameManager.delete(game1);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 9:
				campaignManager.add(campaign1);
				campaignManager.add(campaign2);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 10:
				campaignManager.list(campaigns);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 11:
				campaignManager.update(campaign2);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 12:
				orderManager.add(user2, order2);
				orderManager.add(user1, order1);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 13:
				orderManager.list(orders);
				System.out.print("\nMenüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			case 14:
				_loop=false;
				break;
			default:
				System.out.println("Hatalı Seçim !!!");
				System.out.print("Menüye dönmek için ENTER tuşuna basınız.");
				scn.nextLine();
				break;
			}
			
		}
		while(_loop);

		scn.close();		
	}	
	
}

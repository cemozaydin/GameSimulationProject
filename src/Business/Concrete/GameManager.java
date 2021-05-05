package Business.Concrete;

import Business.Abstract.GameService;
import Entities.Concrete.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklenmiştir.\n" + "Kampanya Adı : " + game.getGameName() + "\n");
		
	}

	@Override
	public void list(Game[] games) {
		System.out.println("~~~~~~~~~~ OYUN LİSTESİ ~~~~~~~~");
		for(Game game:games) {
			System.out.println(game.getId() + " - " + game.getGameName() + " - " + game.getGamePrice());
		}
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silinmiştir.\n" + "Kampanya Adı : " + game.getGameName() + "\n");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellenmiştir.\n" + "Kampanya Adı : " + game.getGameName() + "\n");
		
	}

}

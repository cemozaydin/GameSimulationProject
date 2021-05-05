package Business.Abstract;

import Entities.Concrete.Game;

public interface GameService {
	void add(Game game);
	void list(Game[] games);
	void delete(Game game);
	void update(Game game);

}

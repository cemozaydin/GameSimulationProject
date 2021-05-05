package Business.Abstract;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Order;
import Entities.Concrete.User;

public interface OrderService {
	void add(User user, Order order);
	void list(Order[] orders);

}

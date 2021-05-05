package Business.Concrete;
import Business.Abstract.UserService;
import Entities.Concrete.User;
import adapters.UserValidationService;

public class UserManager implements UserService {

	private UserValidationService userValidation;
	
	
	public UserManager(UserValidationService userValidation) {
		
		this.userValidation = userValidation;
	}

	@Override
	public void add(User user) {
		
		if(this.userValidation.checkPerson(user)) 
		{
			System.out.println("Kullanıcı eklenmiştir : " + user.getFirstName() + " " + user.getLastName() + "\n");
		}
		else 
		{
			System.out.println("Kullanıcı doğrulanamadı. Kayıt Geçersizdir.\n");
		}			
	}

	@Override
	public void list(User[] users) {
		System.out.println("----- Kullanıcı Listesi ------");
		for(User user:users) {
			System.out.println(user.getId() + " | " + user.getFirstName() + " " + user.getLastName() + " | " + user.getIdentityNumber());
		}
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silinmiştir : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellenmiştir : " + user.getFirstName() + " " + user.getLastName());		
	}

}

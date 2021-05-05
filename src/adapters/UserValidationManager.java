package adapters;

import java.rmi.RemoteException;

import Entities.Concrete.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean checkPerson(User user) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNumber()),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),user.getYearOfBirth());
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}

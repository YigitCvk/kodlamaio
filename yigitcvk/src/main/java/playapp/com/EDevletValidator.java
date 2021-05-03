package playapp.com;

public class EDevletValidator extends ValidateManager {

	public boolean Validate(Customer customer) {
		if (customer.getNationalIdentity().length()==11) {
			System.out.println("E-Devlet ile Doğrulandı");
			return true;

		}
		else {
			System.out.println("E-devlet kullanıcı bilgisi ile uymuyor.");
			return false;
		}
		
	}
	
}

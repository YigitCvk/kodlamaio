package playapp.com;

public class CustomerManager implements CustomerService{

	public void add(Customer customer, ValidateManager[] validateManagers) {
		// TODO Auto-generated method stub
		for (ValidateManager validateManager : validateManagers) {
			if (validateManager.Validate(customer)==true) {
				System.out.println("Oyuncu Eklendi ");
			}
			else {
				System.out.println("Oyuncu Eklenmedi");
			}
				
		}
		
	}

	public void update(Customer customer, ValidateManager[] validateManagers) {
		// TODO Auto-generated method stub
		
		for (ValidateManager validateManager : validateManagers) {
			if (validateManager.Validate(customer) == true) {
				System.out.println("Oyuncu güncellendi!");
				}
				else {
					System.out.println("Oyuncu güncellenemedi");
				}
		}
	}

	public void delete(Customer customer, ValidateManager[] validateManagers) {
		// TODO Auto-generated method stub
		for (ValidateManager validateManager : validateManagers) {
			if (validateManager.Validate(customer) == true) {
				System.out.println("Oyuncu silindi");
				}
				else {
					System.out.println("Oyuncu silinemedi");
				}
		}
		
	}

}

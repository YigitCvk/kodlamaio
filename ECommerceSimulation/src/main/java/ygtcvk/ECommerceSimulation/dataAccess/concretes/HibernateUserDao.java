package ygtcvk.ECommerceSimulation.dataAccess.concretes;

import java.util.List;

import ygtcvk.ECommerceSimulation.Entities.concretes.User;
import ygtcvk.ECommerceSimulation.dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {

	public void add(User user) {

		System.out.println("Kullanıcı Kaydildi : "+user.getFirstName());
	}

	public void delete(User user) {
		System.out.println("Kullanici Silindi : ");
		
	}

	public void update(User user) {
		System.out.println("Kullanıcı Silindi : "+user.getId());
		
	}

	public User Get(String eMail) {
        System.out.println("Kullanici Getirildi : ");
		return null;
	}

	public List<User> getAll() {
        System.out.println("Tüm Kullanicilar Listelendi : "); 
		return null;
	}

}

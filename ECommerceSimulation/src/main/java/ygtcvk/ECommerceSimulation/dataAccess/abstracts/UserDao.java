package ygtcvk.ECommerceSimulation.dataAccess.abstracts;

import java.util.List;

import ygtcvk.ECommerceSimulation.Entities.concretes.User;

public interface UserDao {

	void  add(User user);
	void delete(User user);
	void update(User user);
	User Get(String eMail);
	List<User> getAll();
}

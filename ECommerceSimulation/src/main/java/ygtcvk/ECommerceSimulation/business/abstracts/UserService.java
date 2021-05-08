package ygtcvk.ECommerceSimulation.business.abstracts;

import ygtcvk.ECommerceSimulation.Entities.concretes.User;

public interface UserService {
	void login(User user);
	void register(User user);
	void loginWithGoogle();

}

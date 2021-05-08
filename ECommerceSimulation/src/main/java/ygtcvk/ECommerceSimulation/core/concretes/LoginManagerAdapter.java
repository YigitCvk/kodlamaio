package ygtcvk.ECommerceSimulation.core.concretes;

import ygtcvk.ECommerceSimulation.core.abstracts.LoginService;
import ygtcvk.ECommerceSimulation.googleAuth.GoogleLoginManager;

public class LoginManagerAdapter implements LoginService {

	public void login() {

		GoogleLoginManager googleLoginManager=new GoogleLoginManager();
		googleLoginManager.loginWithGoogle();
	}

}

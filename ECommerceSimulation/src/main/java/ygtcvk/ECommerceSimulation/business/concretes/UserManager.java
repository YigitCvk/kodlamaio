package ygtcvk.ECommerceSimulation.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ygtcvk.ECommerceSimulation.Entities.concretes.User;
import ygtcvk.ECommerceSimulation.business.abstracts.UserService;
import ygtcvk.ECommerceSimulation.core.abstracts.EMailService;
import ygtcvk.ECommerceSimulation.core.abstracts.LoginService;
import ygtcvk.ECommerceSimulation.dataAccess.abstracts.UserDao;

public class UserManager implements UserService {
	private UserDao userDao;
	private EMailService eMailService;
	private LoginService loginService;

	public UserManager(UserDao userDao, EMailService eMailService, LoginService loginService) {
		
		this.userDao = userDao;
		this.eMailService = eMailService;
		this.loginService = loginService;
	}

	public void login(User user) {
		User userFromDatabase=this.userDao.Get(user.geteMail());
		if (userFromDatabase!=null&& userFromDatabase.getPassword()==user.getPassword()) {
			System.out.println("Hoşgeldiniz "+userFromDatabase.getFirstName());
		}
		else {
			System.out.println("Email veya Şifre Yanlış ");
		}
		
	}

	public void register(User user) {
		Pattern pattern=Pattern.compile("^(.+)@(.+)$", Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(user.geteMail());
		boolean isEmailValid=matcher.find();
		
		if(!isEmailValid) {
			System.out.println("Lütfen emailinizi doðru girdiðinizden emin olun.");
			
			if(user.getPassword().length() < 6) {
				System.out.println("Þifre en az 6 haneli olmalidir.");
				
				if(this.userDao.Get(user.geteMail()) != null) {
					System.out.println("Bu email daha önce kullanilmiş!");
					
					if(user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
						System.out.println("Ýsim ve soyisim en az 2 haneli olmalidir.");
						
					}
				}
			}
		} 
		else {
			
			boolean isValidated = this.eMailService.sendMail(user.geteMail());
			
			if(isValidated) {
				this.userDao.add(user);
			}
			
		}
		
	}

	
		
	
	

	public void loginWithGoogle() {
		this.loginService.login();
		
	}

}

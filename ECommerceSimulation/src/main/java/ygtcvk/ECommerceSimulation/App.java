package ygtcvk.ECommerceSimulation;

import ygtcvk.ECommerceSimulation.Entities.concretes.User;
import ygtcvk.ECommerceSimulation.business.abstracts.UserService;
import ygtcvk.ECommerceSimulation.business.concretes.UserManager;
import ygtcvk.ECommerceSimulation.core.concretes.EMailManagerAdapter;
import ygtcvk.ECommerceSimulation.core.concretes.LoginManagerAdapter;
import ygtcvk.ECommerceSimulation.dataAccess.concretes.HibernateUserDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user=new User(1,"Yiğit","Ç","ygt@google.com","123456");
        UserService userManager=new UserManager(new HibernateUserDao(), new EMailManagerAdapter(), new LoginManagerAdapter());
        userManager.register(user);
        User user2=new User();
        user2.seteMail("ygt@google.com");
        user2.setPassword("123456");
        userManager.login(user2);
    }
}

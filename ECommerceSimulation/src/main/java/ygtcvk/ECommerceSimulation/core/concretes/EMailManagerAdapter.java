package ygtcvk.ECommerceSimulation.core.concretes;

import ygtcvk.ECommerceSimulation.core.abstracts.EMailService;
import ygtcvk.ECommerceSimulation.jMail.concretes.JMailManager;

public class EMailManagerAdapter implements EMailService{

	public boolean sendMail(String eMail) {
        JMailManager jMailManager=new JMailManager();
        jMailManager.sendMailForValidation(eMail);
        System.err.println("HEsap Doğrulandı");
		return true;
	}

}

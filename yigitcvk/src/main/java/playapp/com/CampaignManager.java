package playapp.com;

public class CampaignManager implements CampaingService {
	
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi : "+campaign.getName());
	}
	public void delete(Campaign campaign) {
		System.out.println("Kampanya artik mevcut değil : "+campaign.getName());
	}
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi : "+campaign.getName());
	}

}

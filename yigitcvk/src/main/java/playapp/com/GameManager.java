package playapp.com;

public class GameManager implements GameService {

	public void sell(Game game, Customer customer, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(game.getName() +" Adlı oyun " + customer.getFirstName()+ " " +customer.getLastName()+ " adlı oyuncuya " );

	}

	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName() + " adlı oyun eklendi.");
	}

	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName() + " adlý oyun silindi.");
	}

}

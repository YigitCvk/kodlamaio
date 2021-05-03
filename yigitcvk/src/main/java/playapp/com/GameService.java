package playapp.com;

public interface GameService {

	void sell(Game game,Customer customer,Campaign campaign);
	void add(Game game);
	void delete(Game game);
}

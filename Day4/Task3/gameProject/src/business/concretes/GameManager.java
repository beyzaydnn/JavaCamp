package business.concretes;

import business.abstracts.GameService;
import dataAccess.GameDao;
import entities.concretes.Game;


public class GameManager implements GameService {
	
	GameDao gameDao = new GameDao();
	@Override
	public void add(Game game) {
		gameDao.add(game);
		
	}

	@Override
	public void delete(Game game) {
		gameDao.delete(game);
		
	}

	@Override
	public void update(Game game) {
		gameDao.update(game);
		
	}

}

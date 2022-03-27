package business.concretes;

import business.abstracts.GamerService;
import dataAccess.GamerDao;

import entities.concretes.Gamer;


public class GamerManager implements GamerService {

	private GamerCheckManager gamerCheckManager;
	
	public GamerManager(GamerCheckManager gamerCheckManager) {
		super();
		this.gamerCheckManager = gamerCheckManager;
		
	}

	GamerDao gamerDao = new GamerDao();
	@Override
	public void add(Gamer gamer) {
		if (gamerCheckManager.checkIfRealPerson(gamer)) {
			gamerDao.add(gamer);
			System.out.println(gamer.getFirstName() +" added ");
		} else {
			System.out.println("no Customer added ");
		}
		gamerDao.add(gamer);
		
	}

	@Override
	public void delete(Gamer gamer) {
		gamerDao.delete(gamer);
		
	}

	@Override
	public void update(Gamer gamer) {
		gamerDao.update(gamer);
		
	}

}



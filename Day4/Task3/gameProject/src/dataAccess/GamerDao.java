package dataAccess;

import java.util.ArrayList;
import java.util.List;


import entities.concretes.Gamer;

public class GamerDao {
	List<Gamer> gamers;


	public GamerDao() {
		
		gamers = new ArrayList<Gamer>();
	}
	
	public void add(Gamer gamer) {
		gamers.add(gamer);
	}
	public void delete(Gamer gamer) {
		gamers.remove(gamer);
	}
	public void update(Gamer gamer) {
		
	}
	public List<Gamer> getAll(){
		return gamers;
	}
}

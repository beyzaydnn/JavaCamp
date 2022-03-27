package business.abstracts;

import entities.concretes.Game;
import entities.concretes.Gamer;
import entities.concretes.Offer;

public interface SalesService {
	void sales(Gamer gamer, Game game, Offer offer );
}

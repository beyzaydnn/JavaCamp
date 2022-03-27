package business.concretes;


import business.abstracts.SalesService;
import entities.concretes.Game;
import entities.concretes.Gamer;
import entities.concretes.Offer;

public class SalesManager implements SalesService  {

	@Override
	public void sales(Gamer gamer, Game game, Offer offer) {
		System.out.println(gamer.getFirstName() + " bought " + game.getGameName() + " game with "
				+ offer.getOfferName() + " campaign. ");
		
	}




}

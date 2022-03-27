package api;

import business.abstracts.GameService;
import business.abstracts.GamerService;
import business.abstracts.OfferService;
import business.abstracts.SalesService;
import business.concretes.GameManager;
import business.concretes.GamerCheckManager;
import business.concretes.GamerManager;
import business.concretes.OfferManager;
import business.concretes.SalesManager;
import entities.concretes.Game;
import entities.concretes.Gamer;
import entities.concretes.Offer;

public class Main {
	public static void main(String[] args) {
	Game game1 = new Game(1,"Mario",23);
	Gamer gamer1 = new Gamer(1,"Beyza","Aydin",123456,"2012","beyzaydin");
	Offer offer1 = new Offer(1,0.3,"BlackFriday");
	
	GameService gameService = new GameManager();
	GamerService gamerService =new GamerManager(new GamerCheckManager());
	OfferService offerService = new OfferManager();
	SalesService salesService = new SalesManager();
	
	
	gameService.add(game1);
	gamerService.add(gamer1);
	offerService.add(offer1);
	salesService.sales(gamer1,game1,offer1);
	
	}
}

package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Game;
import entities.concretes.Gamer;
import entities.concretes.Offer;

public class OfferDao {
	List<Offer> offers;


	public OfferDao() {
		
		offers = new ArrayList<Offer>();
	}
	
	public void add(Offer offer) {
		offers.add(offer);
	}
	public void delete(Offer offer) {
		offers.remove(offer);
	}
	public void update(Offer offer) {
		
	}
	public List<Offer> getAll(){
		return offers;
	}
}

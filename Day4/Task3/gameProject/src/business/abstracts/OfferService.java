package business.abstracts;


import entities.concretes.Offer;

public interface OfferService {
	void add(Offer offer);
	void delete(Offer offer);
	void update(Offer offer);
}

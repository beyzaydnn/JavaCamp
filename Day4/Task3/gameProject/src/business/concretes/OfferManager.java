package business.concretes;

import business.abstracts.OfferService;
import dataAccess.OfferDao;
import entities.concretes.Offer;

public class OfferManager implements OfferService {

	OfferDao offerDao = new OfferDao();
	@Override
	public void add(Offer offer) {
		offerDao.add(offer);
		
	}

	@Override
	public void delete(Offer offer) {
		offerDao.delete(offer);
		
	}

	@Override
	public void update(Offer offer) {
		offerDao.update(offer);
		
	}

}

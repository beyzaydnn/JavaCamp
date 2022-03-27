package entities.concretes;

import entities.abstracts.BaseEntity;

public class Offer extends BaseEntity {
	private double discountRate;
	private String offerName;
	public Offer() {
		super();
	}
	public Offer(int id, double discountRate, String offerName) {
		super(id);
		this.discountRate = discountRate;
		this.offerName = offerName;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

}

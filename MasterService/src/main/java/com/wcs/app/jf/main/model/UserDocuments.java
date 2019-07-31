package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDocuments {
	@Id
	private byte [] aadharCard;
	private byte [] panCard;
	private byte [] photo;
	public byte[] getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(byte[] aadharCard) {
		this.aadharCard = aadharCard;
	}
	public byte[] getPanCard() {
		return panCard;
	}
	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	
}

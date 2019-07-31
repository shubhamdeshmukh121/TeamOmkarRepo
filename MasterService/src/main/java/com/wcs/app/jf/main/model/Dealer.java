package com.wcs.app.jf.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dealer {
	@Id
	private int dealerId;
	private String dealerName;
	private String dealerEmail;
	private long dealerMobno;
	private String dealerGender;
	@OneToOne(cascade=CascadeType.ALL)
	private Address dealerAddress;
	@OneToOne(cascade=CascadeType.ALL)
	private DealerAccountDetail dealerBankAccount;
	private int status;
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerEmail() {
		return dealerEmail;
	}
	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}
	public long getDealerMobno() {
		return dealerMobno;
	}
	public void setDealerMobno(long dealerMobno) {
		this.dealerMobno = dealerMobno;
	}
	public String getDealerGender() {
		return dealerGender;
	}
	public void setDealerGender(String dealerGender) {
		this.dealerGender = dealerGender;
	}
	public Address getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(Address dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public DealerAccountDetail getDealerBankAccount() {
		return dealerBankAccount;
	}
	public void setDealerBankAccount(DealerAccountDetail dealerBankAccount) {
		this.dealerBankAccount = dealerBankAccount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}

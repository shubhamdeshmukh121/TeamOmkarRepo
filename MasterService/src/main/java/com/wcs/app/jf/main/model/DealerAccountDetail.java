package com.wcs.app.jf.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DealerAccountDetail {

	@Id
	private int dealerAccountid;
	private String accountHolder;
	private long bankAccountNo;
	private String bankName;
	@OneToOne(cascade=CascadeType.ALL)
	private Branch dealerBranch;
	public int getDealerAccountid() {
		return dealerAccountid;
	}
	public void setDealerAccountid(int dealerAccountid) {
		this.dealerAccountid = dealerAccountid;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public long getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(long bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Branch getDealerBranch() {
		return dealerBranch;
	}
	public void setDealerBranch(Branch dealerBranch) {
		this.dealerBranch = dealerBranch;
	}
	
	
	
}

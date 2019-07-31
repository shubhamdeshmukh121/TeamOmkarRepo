package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanPolicy {
	@Id
	private int policyId;
	private String policyTitle;
	private String policyDescription;
	private String policyRemarks;
	
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyTitle() {
		return policyTitle;
	}
	public void setPolicyTitle(String policyTitle) {
		this.policyTitle = policyTitle;
	}
	public String getPolicyDescription() {
		return policyDescription;
	}
	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
	}
	public String getPolicyRemarks() {
		return policyRemarks;
	}
	public void setPolicyRemarks(String policyRemarks) {
		this.policyRemarks = policyRemarks;
	}
	
	
	
}

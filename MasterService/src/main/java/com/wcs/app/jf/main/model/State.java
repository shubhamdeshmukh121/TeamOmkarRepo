package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	private int stateId;
	private String stateName;
	private String stateCode;
	private int stateGSTCode;
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public int getStateGSTCode() {
		return stateGSTCode;
	}
	public void setStateGSTCode(int stateGSTCode) {
		this.stateGSTCode = stateGSTCode;
	}
	
	
	
	
}

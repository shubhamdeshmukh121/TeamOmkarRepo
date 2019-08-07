package com.wcs.app.jf.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int userId;
	private String uName;
	@OneToOne(cascade=CascadeType.ALL)
	private Address userPaddress;
	@OneToOne(cascade=CascadeType.ALL)
	private Address userLaddress;
	private long userMobno;
	private long userAmobno;
	private String userEmail;
	private String userGender;
	private String userName;
	private String passWord;
	@OneToOne(cascade=CascadeType.ALL)
	private Role userRole;
	@OneToOne(cascade=CascadeType.ALL)
	private Branch userBranch;
	private String userDob;
	private String userDoj;
	private int userStatusCode;
	@OneToOne(cascade=CascadeType.ALL)
	private UserDocuments userDocuments;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public Address getUserPaddress() {
		return userPaddress;
	}
	public void setUserPaddress(Address userPaddress) {
		this.userPaddress = userPaddress;
	}
	public Address getUserLaddress() {
		return userLaddress;
	}
	public void setUserLaddress(Address userLaddress) {
		this.userLaddress = userLaddress;
	}
	public long getUserMobno() {
		return userMobno;
	}
	public void setUserMobno(long userMobno) {
		this.userMobno = userMobno;
	}
	public long getUserAmobno() {
		return userAmobno;
	}
	public void setUserAmobno(long userAmobno) {
		this.userAmobno = userAmobno;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Role getUserRole() {
		return userRole;
	}
	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}
	
	public Branch getUserBranch() {
		return userBranch;
	}
	public void setUserBranch(Branch userBranch) {
		this.userBranch = userBranch;
	}
	public String getUserDob() {
		return userDob;
	}
	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}
	public String getUserDoj() {
		return userDoj;
	}
	public void setUserDoj(String userDoj) {
		this.userDoj = userDoj;
	}
	public int getUserStatusCode() {
		return userStatusCode;
	}
	public void setUserStatusCode(int userStatusCode) {
		this.userStatusCode = userStatusCode;
	}
	public UserDocuments getUserDocuments() {
		return userDocuments;
	}
	public void setUserDocuments(UserDocuments userDocuments) {
		this.userDocuments = userDocuments;
	}
	
	
}

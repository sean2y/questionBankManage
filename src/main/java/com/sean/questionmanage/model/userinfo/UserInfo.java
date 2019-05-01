package com.sean.questionmanage.model.userinfo;

/**
 * 用户信息表
 * >> 表名 qb_user
 * 
 */
public class UserInfo {

	/**
	 * 用户标识
	 */
	private String userGuid;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 用户密码
	 */
	private String userPassword;
	
	/**
	 * 用户性别
	 */
	private String userGender;
	
	/**
	 * 用户年龄
	 */
	private String userAge;
	
	/**
	 * 入职日期
	 */
	private String userDate;
	
	/**
	 * 用户职称
	 */
	private String userTitle;
	
	/**
	 * 用户身份
	 */
	private String userRole;

	public String getUserGuid() {
		return userGuid;
	}

	public void setUserGuid(String userGuid) {
		this.userGuid = userGuid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserDate() {
		return userDate;
	}

	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserInfo [userGuid=" + userGuid + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userGender=" + userGender + ", userAge=" + userAge + ", userDate=" + userDate + ", userTitle="
				+ userTitle + ", userRole=" + userRole + "]";
	}
	
}

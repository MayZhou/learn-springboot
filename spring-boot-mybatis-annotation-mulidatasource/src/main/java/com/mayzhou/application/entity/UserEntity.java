package com.mayzhou.application.entity;

import java.io.Serializable;

import com.mayzhou.application.enums.UserSexEnum;

public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3678651732007177472L;
	private Long id;

	private String userName;

	private String passWord;

	private UserSexEnum userSex;

	private String nickName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public UserSexEnum getUserSex() {
		return userSex;
	}

	public void setUserSex(UserSexEnum userSex) {
		this.userSex = userSex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public UserEntity(Long id, String userName, String passWord, UserSexEnum userSex, String nickName) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.userSex = userSex;
		this.nickName = nickName;
	}

	public UserEntity() {
		super();
	}

}

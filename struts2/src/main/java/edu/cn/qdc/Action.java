package edu.cn.qdc;

public class Action {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		String str=null;
		if("Admir".equals(username)&&"123456".equals(password))
			str="success";
		else
			str="error";
		return str;
	}
}

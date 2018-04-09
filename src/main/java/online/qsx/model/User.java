package online.qsx.model;

import java.io.Serializable;
import java.util.List;


public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5123800944024916184L;

	private Integer id;

	private String username; // 用户名

	private String password;

	private List<Role> roles;// 所对应的角色集合

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", roles=" + roles +
				'}';
	}
}

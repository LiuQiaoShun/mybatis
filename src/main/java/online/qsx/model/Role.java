package online.qsx.model;

import java.util.List;

public class Role {
	
	private int id;

	private String name;// 角色名称
	
	private List<User> users;// 角色对应的用户实体

	private List<Jurisdiction>jurisdictions;// 权限对应的用户实体

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Jurisdiction> getJurisdictions() {
		return jurisdictions;
	}

	public void setJurisdictions(List<Jurisdiction> jurisdictions) {
		this.jurisdictions = jurisdictions;
	}

	public Role(String name) {
		this.name = name;
	}

	public Role() {
	}

	@Override
	public String toString() {
		return "Role{" +
				"id=" + id +
				", name='" + name + '\'' +
				", jurisdictions=" + jurisdictions +
				'}';
	}
}

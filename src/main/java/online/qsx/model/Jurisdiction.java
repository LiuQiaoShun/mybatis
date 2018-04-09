package online.qsx.model;


import java.util.List;

public class Jurisdiction {

	private int id;

	private String content;// 资源名称

	private List<Role> roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Jurisdiction{" +
				"id=" + id +
				", content='" + content + '\'' +
				'}';
	}
}

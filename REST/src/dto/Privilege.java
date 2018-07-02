package dto;

public class Privilege {

	private int id;
	private String name;
	private String property;
	private String privilege;
	
	public Privilege() {
		
	}
	
	public Privilege(int id, String name, String property, String privilege) {
		
		super();
		this.id = id;
		this.name = name;
		this.property = property;
		this.privilege = privilege;
		
	}

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

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	@Override
	public String toString() {
		return "Privilege [id=" + id + ", name=" + name + ", property=" + property + ", privilege=" + privilege + "]";
	}
	
	
}

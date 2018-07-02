package dto;

public class Role {

	private int id;
	private String implicit;
	private String role;
	private String inherited;
	private String password_required;
	private String common;
	private String oracle_maintained;
	private String authentication_type;
	
	public Role() {
		
	}
	
	public Role(int id, String implicit, String role, String inherited, String password_required, String common, String oracle_maintained, String authentication_type) {
		
		super();
		this.id = id;
		this.implicit = implicit;
		this.role = role;
		this.inherited = inherited;
		this.password_required = password_required;
		this.common = common;
		this.oracle_maintained = oracle_maintained;
		this.authentication_type = authentication_type;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImplicit() {
		return implicit;
	}

	public void setImplicit(String implicit) {
		this.implicit = implicit;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getInherited() {
		return inherited;
	}

	public void setInherited(String inherited) {
		this.inherited = inherited;
	}

	public String getPassword_required() {
		return password_required;
	}

	public void setPassword_required(String password_required) {
		this.password_required = password_required;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getOracle_maintained() {
		return oracle_maintained;
	}

	public void setOracle_maintained(String oracle_maintained) {
		this.oracle_maintained = oracle_maintained;
	}

	public String getAuthentication_type() {
		return authentication_type;
	}

	public void setAuthentication_type(String authentication_type) {
		this.authentication_type = authentication_type;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", implicit=" + implicit + ", role=" + role + ", inherited=" + inherited
				+ ", password_required=" + password_required + ", common=" + common + ", oracle_maintained="
				+ oracle_maintained + ", authentication_type=" + authentication_type + "]";
	}
	
	
	
}

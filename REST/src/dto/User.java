package dto;

public class User {

	private int id;
	private String name;
	private String expirationDate;
	private String creationDate;
	private String common;
	private String accountStatus;
	private String status;
	
	public User() {
		
	}
	
	public User(int id, String name, String expirationDate, String creationDate, String common, String accountStatus, String status) {
		
		super();
		this.id = id;
		this.name = name;
		this.expirationDate = expirationDate;
		this.creationDate = creationDate;
		this.common = common;
		this.accountStatus = accountStatus;
		this.status = status;
		
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

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", expirationDate=" + expirationDate + ", creationDate="
				+ creationDate + ", common=" + common + ", accountStatus=" + accountStatus + ", status=" + status + "]";
	}
	
	
	
}

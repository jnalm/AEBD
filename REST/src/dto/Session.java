package dto;

public class Session {
	
	private int id;
	private String secs_in_wait;
	private String sid;
	private String client_info;
	private String serial;
	private	String instid;
	private String sql_child_number;
	private String sql_id;
	private String status;
	private String osuser;
	private String machine;
	private String action;
	private String module;
	private String command;
	private String resource_consumer_group;
	
	public Session() {
		
	}
	
	public Session(int id, String secs_in_wait, String sid, String client_info, String serial, String instid, String sql_child_number, String sql_id, String status, String osuser, String machine, String action, String module, String command, String resource_consumer_group) {
		
		super();
		this.id = id;
		this.secs_in_wait = secs_in_wait;
		this.sid = sid;
		this.client_info =client_info;
		this.serial = serial;
		this.instid = instid;
		this.sql_child_number = sql_child_number;
		this.sql_id = sql_id;
		this.status = status;
		this.osuser = osuser;
		this.machine = machine;
		this.action = action;
		this.module = module;
		this.command = command;
		this.resource_consumer_group = resource_consumer_group;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecs_in_wait() {
		return secs_in_wait;
	}

	public void setSecs_in_wait(String secs_in_wait) {
		this.secs_in_wait = secs_in_wait;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getClient_info() {
		return client_info;
	}

	public void setClient_info(String client_info) {
		this.client_info = client_info;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getInstid() {
		return instid;
	}

	public void setInstid(String instid) {
		this.instid = instid;
	}

	public String getSql_child_number() {
		return sql_child_number;
	}

	public void setSql_child_number(String sql_child_number) {
		this.sql_child_number = sql_child_number;
	}

	public String getSql_id() {
		return sql_id;
	}

	public void setSql_id(String sql_id) {
		this.sql_id = sql_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOsuser() {
		return osuser;
	}

	public void setOsuser(String osuser) {
		this.osuser = osuser;
	}

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getResource_consumer_group() {
		return resource_consumer_group;
	}

	public void setResource_consumer_group(String resource_consumer_group) {
		this.resource_consumer_group = resource_consumer_group;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", secs_in_wait=" + secs_in_wait + ", sid=" + sid + ", client_info=" + client_info
				+ ", serial=" + serial + ", instid=" + instid + ", sql_child_number=" + sql_child_number + ", sql_id="
				+ sql_id + ", status=" + status + ", osuser=" + osuser + ", machine=" + machine + ", action=" + action
				+ ", module=" + module + ", command=" + command + ", resource_consumer_group=" + resource_consumer_group
				+ "]";
	}
	
	
	
}

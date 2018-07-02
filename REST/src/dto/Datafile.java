package dto;

public class Datafile {
	
	private int id;
	private String freeSpace;
	private String autoExtend;
	private String name;
	private String type;
	private String maximumSize;
	private String size;
	
	public Datafile() {
		
	}
	
	public Datafile(int id, String freeSpace, String autoExtend, String name, String type, String maximumSize, String size) {
		
		super();
		this.id = id;
		this.freeSpace = freeSpace;
		this.autoExtend = autoExtend;
		this.name = name;
		this.type = type;
		this.maximumSize = maximumSize;
		this.size = size;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
	}

	public String getAutoExtend() {
		return autoExtend;
	}

	public void setAutoExtend(String autoExtend) {
		this.autoExtend = autoExtend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaximumSize() {
		return maximumSize;
	}

	public void setMaximumSize(String maximumSize) {
		this.maximumSize = maximumSize;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Datafile [id=" + id + ", freeSpace=" + freeSpace + ", autoExtend=" + autoExtend + ", name=" + name
				+ ", type=" + type + ", maximumSize=" + maximumSize + ", size=" + size + "]";
	}
	
	
	
}

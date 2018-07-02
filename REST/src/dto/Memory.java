package dto;

public class Memory {

	private int id;
	private String statistic;
	private String sgaPool;
	private String bytes;
	
	public Memory() {
		
	}
	
	public Memory(int id, String statistic, String sgaPool, String bytes) {
		
		super();
		this.id = id;
		this.statistic = statistic;
		this.sgaPool = sgaPool;
		this.bytes = bytes;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatistic() {
		return statistic;
	}

	public void setStatistic(String statistic) {
		this.statistic = statistic;
	}

	public String getSgaPool() {
		return sgaPool;
	}

	public void setSgaPool(String sgaPool) {
		this.sgaPool = sgaPool;
	}

	public String getBytes() {
		return bytes;
	}

	public void setBytes(String bytes) {
		this.bytes = bytes;
	}

	@Override
	public String toString() {
		return "Memory [id=" + id + ", statistic=" + statistic + ", sgaPool=" + sgaPool + ", bytes=" + bytes + "]";
	}
	
	
	
}

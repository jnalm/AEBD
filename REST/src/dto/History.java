package dto;

public class History {

	private int id;
	
	public History() {
		
	}
	
	public History(int id) {
		
		super();
		this.id = id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "History [id=" + id + "]";
	}
	
	
	
}

package co.grandcircus.ApiDonut;



public class Extras {
	private String name;
	
	

	public Extras(String name) {
		super();
		this.name = name;
	}

	public String getExtras() {
		return name;
	}

	public void setExtras(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	

}

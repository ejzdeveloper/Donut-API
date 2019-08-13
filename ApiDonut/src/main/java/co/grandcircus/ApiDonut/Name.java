package co.grandcircus.ApiDonut;

public class Name {

	private String name;

	public Name(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name [string=" + name + "]";
	}

	

}

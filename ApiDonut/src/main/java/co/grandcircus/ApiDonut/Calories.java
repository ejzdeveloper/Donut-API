package co.grandcircus.ApiDonut;

public class Calories {

	private Integer calories;

	public Calories(Integer calories) {
		super();
		this.calories = calories;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Name [string=" + calories + "]";
	}

	

}

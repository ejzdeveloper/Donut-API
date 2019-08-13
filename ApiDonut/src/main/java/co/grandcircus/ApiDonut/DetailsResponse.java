package co.grandcircus.ApiDonut;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailsResponse {
	@JsonProperty("extras")
	private List<Extras> extras;
	@JsonProperty("name")
	private Name name;
	@JsonProperty("calories")
	private Calories calories;
	
	public  DetailsResponse (){}

	public List<Extras> getExtras() {
		return extras;
	}

	public void setExtras(List<Extras> extras) {
		this.extras = extras;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Calories getCalories() {
		return calories;
	}

	public void setCalories(Calories calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "DetailsResponse [extras=" + (extras != null ? extras.subList(0, Math.min(extras.size(), maxLen)) : null)
				+ ", name=" + name + ", calories=" + calories + "]";
	}

	

	

	

	
	
	
	
	
}//end class

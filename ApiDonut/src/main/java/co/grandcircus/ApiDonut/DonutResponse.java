package co.grandcircus.ApiDonut;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutResponse {
	@JsonProperty("results")
	private List<Results> Results;
	
	public  DonutResponse (){}

	public List<Results> getResults() {
		return Results;
	}

	public void setResults(List<Results> results) {
		Results = results;
	}

	@Override
	public String toString() {
		return "DonutResponse [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}//end class

package co.grandcircus.ApiDonut;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//Donut API Service

@Component
public class ApiService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	{
	    ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

		
	public List<Results> showAll() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);
		List<Results> myList = response.getResults();
		return myList;
	}
	
	public Name showName(Integer id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		DetailsResponse response = restTemplate.getForObject(url, DetailsResponse.class);
		Name result = response.getName();
		return result;
	}
	
	public Calories showCalories(Integer id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		DetailsResponse response = restTemplate.getForObject(url, DetailsResponse.class);
		Calories result = response.getCalories();
		return result;
	}
	
	public List<Extras> showExtras(Integer id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		DetailsResponse response = restTemplate.getForObject(url, DetailsResponse.class);
		List<Extras> result = response.getExtras();
		return result;
	}
	
}//end class

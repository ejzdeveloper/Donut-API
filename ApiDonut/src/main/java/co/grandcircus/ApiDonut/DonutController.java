package co.grandcircus.ApiDonut;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DonutController {
	
	@Autowired
	private ApiService apiService;
    public List<Results> allDonuts;
    public Name name;
    public Calories calories;
    public List<Extras> extras;
    
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("donuts-list");
		allDonuts = apiService.showAll();
		mv.addObject("donuts", allDonuts);
		return mv;
	}
	
	@GetMapping("/details/{id}")
	public ModelAndView showDetails(
			@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView("details");
		name = apiService.showName(id);
		mv.addObject("name", name);
		calories = apiService.showCalories(id);
		mv.addObject("calories", calories);
		extras = apiService.showExtras(id);
		mv.addObject("extras", extras);
		return mv;
	}



	
	
}//end class

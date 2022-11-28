package springmvc.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
	@RequestMapping("/search")
	public String search()
	{
		return "search";
	}
	
//	@RequestMapping(path="startProcess", method = RequestMethod.POST)
	@RequestMapping("startProcess")
	public String start(@RequestParam("textField") String query)
	{
		if(query.isBlank()) 
		{
			return "redirect:search";
		}
		else
		{
			// google follow this pattern to search anything
			String url="https://www.google.com/search?q="+query;
			return "redirect:"+url;
		}
	}

}

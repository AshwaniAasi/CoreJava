package springmvc.search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String complex()
	{
		return "registration";
	}
	
	@RequestMapping(path="/handle", method = RequestMethod.POST)
	public String handler(@ModelAttribute("student") Student student, BindingResult result)
	{
		if(result.hasErrors()) {
			return "registration";
		}else {
			System.out.println(student);
			return "success";
		}	
	}
	
	@RequestMapping("/send")
	public String fileUpload()
	{
		return"fileUpload";
	}
	
	// after uploading file not working
	//path or value almost same work
	@RequestMapping(value="/uploadImage", method = RequestMethod.POST)
	public String uploaded(@RequestParam("uploadFile") CommonsMultipartFile file)
	{
		
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		
		return "filesuccess";
	}
	
	@RequestMapping("/user/{id}/{userName}")
	public String bind(@PathVariable("id") int id, @PathVariable("userName") String userName)
	{
		System.out.println(id); 
		System.out.println(userName);
		return "success";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class, NumberFormatException.class}) // in one method
	public String exception(Model m)
	{
		m.addAttribute("msg", "Null Pointer or Number Format Exception occur");
		return "errorPage";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR) // for unknown exceptions
	@ExceptionHandler(value=Exception.class)
	public String exceptionAll(Model m)
	{
		m.addAttribute("msg", "Some Exception has occured");
		return "errorPage";
	}

}

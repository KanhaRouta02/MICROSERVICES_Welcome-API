package in.kanha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.kanha.feign.AccessGreet;

@RestController
public class WelcomeRest {
	
	@Autowired
	private AccessGreet greet;

	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		String getfeign = greet.getfeign();
		return getfeign +" , Welcome To KanhaIT";
	}
}

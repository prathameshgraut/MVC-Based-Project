package MVC.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/Login")
	public String doGet() {
		return "Login";
	}

	@PostMapping("/Login")
	public String doPost(@RequestParam String Username,@RequestParam String Password) {
		if(Username.equals("Admin") && Password.equals("12345")) {
			return "Dashboard";
		}
		return "Login";
	}
	
	@GetMapping("/Logout")
	public String doGetlogOut() {
		return "Login";
	}
	
	@GetMapping("/help")
	public String doGetHelp() {
		return "help";
	}
	
	@GetMapping("/setting")
	public String doGetSetting() {
	    return "setting";
	}
	
}

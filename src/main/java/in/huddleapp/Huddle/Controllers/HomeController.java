package in.huddleapp.Huddle.Controllers;

import in.huddleapp.Huddle.Models.User;
import in.huddleapp.Huddle.Repository.UserRepository;
import in.huddleapp.Huddle.Utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{

		@Autowired private UserRepository userRepository;

		@RequestMapping(value = UrlConstants.HOMEPAGE)
		public String sayHi()
		{
				return "Huddle Up!";
		}


}

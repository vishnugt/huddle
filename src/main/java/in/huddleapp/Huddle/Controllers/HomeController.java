package in.huddleapp.Huddle.Controllers;

import in.huddleapp.Huddle.Repository.UserRepository;
import in.huddleapp.Huddle.Utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
		@RequestMapping(value = UrlConstants.HOMEPAGE)
		public String sayHi()
		{
				return "Huddle Up!";
		}
}

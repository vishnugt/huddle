package in.huddleapp.Huddle.Controllers;

import in.huddleapp.Huddle.Utility.URLConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
		@RequestMapping(value = URLConstants.HOMEPAGE)
		public String sayHi()
		{
				return "Huddle Up!";
		}

}

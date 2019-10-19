package in.huddleapp.Huddle.Controllers;

import in.huddleapp.Huddle.Repository.UserRepository;
import in.huddleapp.Huddle.Utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
		@RequestMapping(value = UrlConstants.HOMEPAGE)
		public String sayHi()
		{
				String username = SecurityContextHolder.getContext().getAuthentication().getName();
				return "Huddle Up, " + username + "!" ;
		}
}

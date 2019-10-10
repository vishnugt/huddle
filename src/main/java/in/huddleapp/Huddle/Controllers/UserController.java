package in.huddleapp.Huddle.Controllers;

import in.huddleapp.Huddle.Models.User;
import in.huddleapp.Huddle.Repository.UserRepository;
import in.huddleapp.Huddle.Utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstants.USER_BASE_URL)
public class UserController
{
		@Autowired private UserRepository userRepository;


		@PostMapping(path = UrlConstants.ADD_USER)
		public @ResponseBody
		String addNewUser(@RequestParam String name, @RequestParam String email)
		{
				User user = new User();
				user.setName(name);
				user.setEmail(email);
				userRepository.save(user);
				return "Saved";
		}

		@GetMapping(path = UrlConstants.ALL_USER)
		public @ResponseBody
		Iterable<User> getAllUsers()
		{
				return userRepository.findAll();
		}

}

package in.huddleapp.Huddle.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan(basePackageClasses = { UserRepository.class })
@RestController
public class HomeController
{

		@Autowired
		private UserRepository userRepository;

		@RequestMapping(value = "/")
		public String sayHi()
		{
				return "Huddle Up!";
		}

		@PostMapping(path = "/add")
		public @ResponseBody
		String addNewUser(@RequestParam String name, @RequestParam String email)
		{
				User user = new User();
				user.setName(name);
				user.setEmail(email);
				userRepository.save(user);
				return "Saved";
		}

		@GetMapping(path = "/all")
		public @ResponseBody
		Iterable<User> getAllUsers()
		{
				return userRepository.findAll();
		}

}

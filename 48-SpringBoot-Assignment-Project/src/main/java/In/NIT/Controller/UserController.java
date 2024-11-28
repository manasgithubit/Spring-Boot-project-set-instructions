package In.NIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import In.NIT.Entity.User;
import In.NIT.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user)
	{
		User savedUser = userService.register(user);
		return ResponseEntity.status(201).body(savedUser);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody  User user)
	{
		return userService.login(user.getEmail(), user.getPassword()).map(u->ResponseEntity.ok("Login Successful")).orElse(ResponseEntity.status(401).body("Invalid Credentials"));
	}
}

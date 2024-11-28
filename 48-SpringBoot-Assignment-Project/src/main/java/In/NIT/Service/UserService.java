package In.NIT.Service;

import java.util.Optional;
import org.springframework.stereotype.Service;

import In.NIT.Entity.User;
import In.NIT.Repo.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	public User register(User user)
	{
		return userRepository.save(user);
	}
	
	public UserService(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}
	
	public Optional<User> login(String email, String password)
	{
		return  userRepository.findByEmail(email).filter(u -> u.getPassword().equals(password));
	}
}

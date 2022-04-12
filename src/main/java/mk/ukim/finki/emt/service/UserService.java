package mk.ukim.finki.emt.service;


import mk.ukim.finki.emt.model.User;
import mk.ukim.finki.emt.model.enumerations.Role;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User register(String username, String password, String repeatPassword, String name, String surname, Role role);
}

package dio.spring;

import dio.spring.model.User;
import dio.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setNome("Joao Otavio");
        user.setUserName("Otavio");
        user.setPassword("1234");

        userRepository.save(user);

        for (User u: userRepository.findAll()) {
            System.out.println(u);
        }
    }
}

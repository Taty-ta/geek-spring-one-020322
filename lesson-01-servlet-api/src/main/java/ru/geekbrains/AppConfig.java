package ru.geekbrains;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.geekbrains.persist.ProductRepository;
import ru.geekbrains.persist.ProductRepositoryImpl;


@Configuration
@ComponentScan("ru.geekbrains")
public class AppConfig {


    /*@Bean
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }
*/
    @Bean
    public ProductRepository productRepository() {
        return (ProductRepository) new ProductRepositoryImpl();
    }

    /*@Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }
*/
    @Bean
    @Scope("prototype")
    public CartService cartService() {
        return new CartService();
    }
}

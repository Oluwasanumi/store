package com.caspercodes.store;

import com.caspercodes.store.registration.User;
import com.caspercodes.store.registration.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();

        var userService = context.getBean(UserService.class);
        var user = new User(123L, "Casper", "casper@demo.com", "secret123");
        userService.registerUser(user);
//        userService.registerUser(user);
    }
}

package com.caspercodes.store;

import com.caspercodes.store.entities.Address;
import com.caspercodes.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
                .name("admin")
                .email("admin@mail.com")
                .password("admins")
                .build();

        Address address = Address.builder().
                street("123 Main St")
                .city("Springfield")
                .state("IL")
                .zip("62701")
                .build();

        user.addAddress(address);

        System.out.println(user);
    }
}
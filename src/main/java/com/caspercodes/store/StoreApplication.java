package com.caspercodes.store;

import com.caspercodes.store.entities.Profile;
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

        Profile profile = Profile.builder()
                .bio("bio")
                .build();

        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);
    }
}
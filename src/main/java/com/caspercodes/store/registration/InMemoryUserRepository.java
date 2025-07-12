package com.caspercodes.store.registration;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository  implements UserRepository {

    private final Map<String,User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getEmail(), user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return users.containsKey(email);
    }
}
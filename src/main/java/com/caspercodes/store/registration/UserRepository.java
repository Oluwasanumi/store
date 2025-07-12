package com.caspercodes.store.registration;


public interface UserRepository {
    void save(User user);
    boolean existsByEmail(String email);
}

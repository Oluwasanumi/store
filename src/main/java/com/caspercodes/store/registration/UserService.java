package com.caspercodes.store.registration;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists.");
        }

        userRepository.save(user);
        notificationService.send("Welcome to our store " + user.getName() + "!", user.getEmail());
    }
}

package com.api.userservice.controller;

import com.api.userservice.exception.UserNotFoundException;
import com.api.userservice.model.User;
import com.api.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user-service/users")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<String> getUserName(@PathVariable Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User Not Found with give id : "+id));
        return ResponseEntity.ok(user.getName());
    }
}

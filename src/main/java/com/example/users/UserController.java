package com.example.users;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Map<Integer, User> users = new HashMap<>();

    // GET /users/{id}
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return users.getOrDefault(id, new User(id, "Unknown"));
    }

    // POST /users
    @PostMapping
    public User createUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return user;
    }

    // GET /users
    @GetMapping
    public Collection<User> getAllUsers() {
        return users.values();
    }
}

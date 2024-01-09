package org.example.user.controller;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import lombok.RequiredArgsConstructor;
import org.example.user.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserResource {

    @GetMapping
    public List<User> findAll() {
        return Arrays.asList(
            new User("hong", "홍길동"),
            new User("kim", UUID.randomUUID().toString()),
            new User("lee", UUID.randomUUID().toString())
        );
    }

    @GetMapping("{id}")
    public User find(
        @PathVariable String id
    ) {
        return new User(id, UUID.randomUUID().toString());
    }
}

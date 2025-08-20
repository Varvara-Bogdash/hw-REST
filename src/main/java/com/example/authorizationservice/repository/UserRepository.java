package com.example.authorizationservice.repository;

import com.example.authorizationservice.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        // Имитация базы данных пользователей
        if ("admin".equals(user) && "admin123".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if ("user".equals(user) && "user123".equals(password)) {
            return Arrays.asList(Authorities.READ);
        } else if ("guest".equals(user) && "guest123".equals(password)) {
            return new ArrayList<>();
        }
        return null;
    }
}
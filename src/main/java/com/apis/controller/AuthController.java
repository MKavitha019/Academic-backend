
package com.apis.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.apis.repository.UserRepository;
import com.apis.entity.User;
@RestController @RequestMapping("/auth")
public class AuthController{
@Autowired UserRepository repo;
@PostMapping("/register")
public User register(@RequestBody User u){return repo.save(u);}
}

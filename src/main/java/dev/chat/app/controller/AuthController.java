package dev.chat.app.controller;
import dev.chat.app.model.User;
import dev.chat.app.model.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        if (userService.findByEmail(user.getEmail()) != null) {
            return "User already exists";
        }
        userService.register(user);
        return "Registration successful";
    }
}

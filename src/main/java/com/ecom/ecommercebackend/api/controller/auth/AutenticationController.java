package com.ecom.ecommercebackend.api.controller.auth;

import com.ecom.ecommercebackend.api.model.RegistrationBody;
import com.ecom.ecommercebackend.model.LocalUser;
import com.ecom.ecommercebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AutenticationController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public LocalUser registerUser(@RequestBody RegistrationBody registrationBody) {
        return userService.registerUser(registrationBody);
    }
}

package com.login.appuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppUserController {

    @GetMapping
    public String helloUser() {
        return "Hello!!!";
    }
}

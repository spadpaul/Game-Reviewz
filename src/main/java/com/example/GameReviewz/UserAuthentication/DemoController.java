package com.example.GameReviewz.UserAuthentication;

import com.example.GameReviewz.UserAuthentication.authentication.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth/demo")
@RequiredArgsConstructor
public class DemoController {
    @Autowired
    private AuthenticationService service;
//    public ResponseEntity<User> getUser (){
//        return new ResponseEntity<>()
//    }
}

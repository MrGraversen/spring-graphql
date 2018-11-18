package io.graversen.springgraphql.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sessions")
public class SessionController
{
    @PostMapping
    public ResponseEntity<Void> newSession()
    {
        /*
         * Let's imagine I've implemented some form of authentication which rewards the user with a JWT.
         * I promise - had I implemented this - it would not be BEAUTIFUL!
         * It would contain many claims; none of which would be meme-related in the slightest.
         */
        return ResponseEntity.ok().build();
    }
}

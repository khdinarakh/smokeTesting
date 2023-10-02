package com.boots.smokeTesting;

import com.boots.dto.AuthenticationRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserAuthenticationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testUserAuthentication() {
        AuthenticationRequest request = new AuthenticationRequest("khdinarakh", "password");

        ResponseEntity<Void> response = restTemplate.postForEntity("/authenticate", request, Void.class);

        assert (response.getStatusCode().is2xxSuccessful());
    }
}


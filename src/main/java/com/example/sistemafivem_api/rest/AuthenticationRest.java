package com.example.sistemafivem_api.rest;

import com.example.sistemafivem_api.rest.dto.AuthenticationDTO;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;


@RestController
@RequestMapping(value = "/auth")
public class AuthenticationRest {

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthenticationDTO data) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.senha());
        Authentication auth = authenticationManager.authenticate(usernamePassword);
        
        return ResponseEntity.ok("Autenticado com sucesso");

    }
}

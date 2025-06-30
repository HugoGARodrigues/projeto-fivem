package com.example.sistemafivem_api.service;

import org.springframework.stereotype.Service;

import com.example.sistemafivem_api.repository.UserRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class AuthorizationService implements UserDetailsService {

    

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        var userOptional = userRepository.findByEmail(email);
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException("Usuário não encontrado: " + email);
        }
        var user = userOptional.get();
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())
                .password(user.getSenha())
                .authorities("USER") // Replace with actual authorities if available
                .build();
    }

}

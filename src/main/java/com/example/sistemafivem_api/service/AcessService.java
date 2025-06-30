package com.example.sistemafivem_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import com.example.sistemafivem_api.repository.AccessRepository;
import com.example.sistemafivem_api.entity.Access;
import com.example.sistemafivem_api.entity.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class AcessService implements UserDetailsService {

    @Autowired
    private AccessRepository accessRepository;

    @Autowired
    private User user;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        user = user.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + email));
        Access access = accessRepository.findByUserId(user.id)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + email));
        return access;
    }
    
}

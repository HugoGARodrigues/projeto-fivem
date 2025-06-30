package com.example.sistemafivem_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.sistemafivem_api.entity.Access;
import com.example.sistemafivem_api.entity.User;
import com.example.sistemafivem_api.repository.AccessRepository;

@Service
public class AcessService implements UserDetailsService {

    @Autowired
    private AccessRepository accessRepository;

    @Autowired
    private Access access;

    @Autowired
    private User user;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        access = accessRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + email));
       
        return access;
    }
    
}

package com.shahov.cdp.security;

import com.shahov.cdp.model.User;
import com.shahov.cdp.repositories.UserRepository;
import com.shahov.cdp.security.SecurityUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SecurityUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(userRepository.getByEmail(s));
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + s));
        return new SecurityUserDetails(user.get());
    }
}

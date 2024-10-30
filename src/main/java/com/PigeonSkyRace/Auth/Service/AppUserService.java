package com.PigeonSkyRace.Auth.Service;

import com.PigeonSkyRace.Auth.models.AppUser;
import com.PigeonSkyRace.Auth.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements UserDetailsService {

    @Autowired
    AppUserRepository appUserRepository ;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUserRepository.findByUsername(username);
        if (appUser != null) {
            var springUser = User.withUsername(appUser.getUsername()).password(appUser.getPassword()).roles(appUser.getRole()).build();
            return springUser;
        }
        return null;
    }
}

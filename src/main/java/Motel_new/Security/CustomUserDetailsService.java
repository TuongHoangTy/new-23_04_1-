package Motel_new.Security;

import Motel_new.Entity.Account;
import Motel_new.Error.ErrorMessage;
import Motel_new.Error.UsernameIncorrectException;
import Motel_new.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.Collections;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String email) {
        Account user = accountRepository.findByEmail(email).orElseThrow(() -> new RuntimeException(ErrorMessage.MISSING_EMAIL_ADDRESS.name()));

        GrantedAuthority authority = new SimpleGrantedAuthority(user.getUserRole().toString()); // chú thiếu kế sao mà chép vô méo sửa


        return new CustomUserDetails(user.getId(), user.getFullName(), user.getPhoneNumber(), user.getEmail(), user.getPassword(), Collections.singletonList(authority));
    }
}

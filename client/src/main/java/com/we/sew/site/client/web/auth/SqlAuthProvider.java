package com.we.sew.site.client.web.auth;

import com.we.sew.site.core.model.SiteUser;
import com.we.sew.site.core.repository.SiteUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author Vladyslav_Yemelianov
 */
@Component
public class SqlAuthProvider implements AuthenticationProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(SqlAuthProvider.class);

    @Autowired
    private SiteUserRepository repository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        String password = authentication.getCredentials().toString();

        SiteUser siteUser = repository.findOneByEmail(email);
        String md5Pass = DigestUtils.md5DigestAsHex(password.getBytes());
        if (siteUser == null || !siteUser.getPassword().equals(md5Pass)) {
            LOGGER.error("To {} tried login with pass {}", email, password);
            throw new BadCredentialsException("User or password is incorrect.");
        }
        SimpleGrantedAuthority userAuthority = new SimpleGrantedAuthority(siteUser.getUserRole().getValue());
        List<SimpleGrantedAuthority> authorities = Collections.singletonList(userAuthority);
        UserDetails principal = new User(siteUser.getEmail(), siteUser.getPassword(), authorities);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("{} authorized as {}", siteUser.getEmail(), userAuthority.toString());
        }
        return new UsernamePasswordAuthenticationToken(principal, siteUser.getPassword(), authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}

package com.garygml.app.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.garygml.app.entity.user.User;
import com.garygml.app.entity.userrole.UserRole;
import com.garygml.app.service.user.UserService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	UserService userService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getPrincipal() + "";
		String password = authentication.getCredentials() + "";

		User user = userService.findByUsername(username);
		if (null == user) {
			throw new BadCredentialsException("Incorrect Credentials. ");
		}
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if (!encoder.matches(password, user.getPassword())) {
			throw new BadCredentialsException("Incorrect Credentials. ");
		}

		List<GrantedAuthority> grantAuths = new ArrayList<GrantedAuthority>();
		for (UserRole userRole : user.getUserRole()) {
			grantAuths.add(new SimpleGrantedAuthority(userRole.getRole().getRoleCode()));
		}
		return new UsernamePasswordAuthenticationToken(username, password, grantAuths);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}

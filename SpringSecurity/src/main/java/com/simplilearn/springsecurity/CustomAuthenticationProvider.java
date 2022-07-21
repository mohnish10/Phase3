package com.simplilearn.springsecurity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class CustomAuthenticationProvider implements AuthenticationProvider{


List<User> dummyUsers = new ArrayList<>();


public CustomAuthenticationProvider()
{
dummyUsers.add(new User("mohnish","theultimateone","ROLE_USER"));
dummyUsers.add(new User("admin","admin","ROLE_ADMIN"));
}


public Authentication authenticate(Authentication authentication) throws AuthenticationException
{
String name = authentication.getName();
String password = authentication.getCredentials().toString();

Optional<User> authenticatedUser = dummyUsers.stream().filter(user->user.getName().equals(name) && user.getPassword().equals(password)).findFirst();

if(!authenticatedUser.isPresent())
{
throw new BadCredentialsException("Some Test");	
}


List<GrantedAuthority> authorities = new ArrayList<>();
authorities.add(new SimpleGrantedAuthority(authenticatedUser.get().getRole()));
Authentication auth = new UsernamePasswordAuthenticationToken(name,password,authorities);
return auth;
}



public boolean supports(Class<?> authentication) {
    return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
}

	
	
	
	
	
	
	
}

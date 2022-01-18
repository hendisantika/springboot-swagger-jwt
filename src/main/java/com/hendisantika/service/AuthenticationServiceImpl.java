package com.hendisantika.service;

import com.hendisantika.exception.AuthenticationException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-swagger-jwt
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/22
 * Time: 06.51
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {


    /**
     * Method will validate Token else throw exception in case of invalid token
     *
     * @param authToken
     * @throws AuthenticationException
     */
    @Override
    public void validateAuthorisation(String authToken) throws AuthenticationException {

        //How oAuth Token works is not part of Swagger implementation. We are only seeing a crude way we can
        // authenticate token
        if (StringUtils.isEmpty(authToken))
            throw new AuthenticationException("Auth token is not set. Please generate and set auth token");
        else if (authToken.contains("invalid"))
            throw new AuthenticationException("Invalid oAuth Token. Please generate a new one and use");
        else
            return; //to do actual 3rd party call to validate token
    }
}

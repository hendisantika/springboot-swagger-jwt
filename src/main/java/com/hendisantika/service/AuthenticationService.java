package com.hendisantika.service;

import com.hendisantika.exception.AuthenticationException;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-swagger-jwt
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/22
 * Time: 06.49
 */
public interface AuthenticationService {

    /**
     * Method will validate Token else throw exception in case of invalid token
     *
     * @param authToken
     * @throws AuthenticationException
     */
    void validateAuthorisation(String authToken) throws AuthenticationException;
}

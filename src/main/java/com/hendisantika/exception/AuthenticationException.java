package com.hendisantika.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-swagger-jwt
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/22
 * Time: 06.43
 */
public class AuthenticationException extends Exception {

    /**
     * Generated Serial Version ID
     */
    private static final long serialVersionUID = 89219759617922093L;

    public AuthenticationException(String msg) {
        super(msg);
    }
}

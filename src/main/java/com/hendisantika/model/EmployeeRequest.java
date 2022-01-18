package com.hendisantika.model;

import com.squareup.moshi.Json;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-swagger-jwt
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/22
 * Time: 06.46
 */
public class EmployeeRequest {
    @Json(name = "first_name")
    private String firstName;

    @Json(name = "last_name")
    private String lastName;

    public EmployeeRequest() {
        firstName = null;
        lastName = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

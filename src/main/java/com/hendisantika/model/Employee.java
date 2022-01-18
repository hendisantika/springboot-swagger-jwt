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
public class Employee extends EmployeeRequest {

    @Json(name = "id")
    private String id;

    public Employee() {
        super();
        id = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

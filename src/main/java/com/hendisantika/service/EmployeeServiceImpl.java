package com.hendisantika.service;

import com.hendisantika.model.Employee;
import com.hendisantika.model.EmployeeRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-swagger-jwt
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/22
 * Time: 06.50
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    //we can integrate this with db, but as we only want to see swagger demo, we put data in map
    private final Map<String, Employee> employeeStore = new HashMap<>();

    @Override
    public Employee addNewEmployee(EmployeeRequest request) {

        logger.debug("Add new employee to the employee store");
        String id = UUID.randomUUID().toString();

        Employee employee = new Employee();
        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setId(id);

        employeeStore.put(id, employee);
        logger.debug("Employee Count {}", employeeStore.size());

        return employee;
    }
}

# Spring Boot Swagger JWT

A Spring Boot REST API application demonstrating the integration of Swagger/OpenAPI 3.0 documentation with JWT
authentication security.

## Description

This project showcases a production-ready REST API with comprehensive API documentation using OpenAPI 3.0 (Swagger) and
JWT-based security authentication. It provides a complete employee management system with CRUD operations, demonstrating
best practices for API documentation and security in Spring Boot applications.

## Technologies Used

- **Spring Boot 3.5.6** - Main application framework
- **Java 21** - Programming language
- **SpringDoc OpenAPI 2.7.0** - API documentation (OpenAPI 3.0 specification)
- **Moshi 1.15.2** - Modern JSON library for Java
- **Maven** - Build and dependency management
- **SLF4J/Logback** - Logging framework

## Features

- RESTful API with full CRUD operations for Employee management
- OpenAPI 3.0 / Swagger UI integration for interactive API documentation
- JWT Bearer token authentication for secure endpoints
- Comprehensive API documentation with detailed request/response examples
- Exception handling with custom authentication exceptions
- Request/Response validation
- Structured logging with timestamps

## Prerequisites

Before running this application, ensure you have:

- Java 21 or higher installed
- Maven 3.x installed
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/hendisantika/springboot-swagger-jwt.git
cd springboot-swagger-jwt
```

2. Build the project:

```bash
mvn clean install
```

## Running the Application

### Using Maven:

```bash
mvn spring-boot:run
```

### Using the JAR file:

```bash
java -jar target/springboot-swagger-jwt-0.0.1-SNAPSHOT.jar
```

The application will start on port **8080** by default.

## Accessing the API Documentation

Once the application is running, you can access:

- **Swagger UI**: http://localhost:8080/swagger-ui/index.html
- **OpenAPI JSON**: http://localhost:8080/v3/api-docs
- **OpenAPI YAML**: http://localhost:8080/v3/api-docs.yaml

## API Endpoints

### Employee Management

| Method | Endpoint                   | Description           | Authentication Required |
|--------|----------------------------|-----------------------|-------------------------|
| GET    | `/employees`               | Get all employees     | No                      |
| GET    | `/employees/{employee-id}` | Get employee by ID    | No                      |
| POST   | `/employees`               | Add new employee      | Yes (JWT)               |
| PUT    | `/employees`               | Update employee       | Yes (JWT)               |
| DELETE | `/employees/{employee-id}` | Delete employee by ID | Yes (JWT)               |

### Clients

| Method | Endpoint   | Description     | Authentication Required |
|--------|------------|-----------------|-------------------------|
| GET    | `/clients` | Get all clients | No                      |

## Authentication

Protected endpoints require a JWT Bearer token in the Authorization header:

```
Authorization: Bearer <your-jwt-token>
```

### Example Request with Authentication:

```bash
curl -X POST http://localhost:8080/employees \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..." \
  -d '{
    "firstName": "John",
    "lastName": "Doe"
  }'
```

## API Request/Response Examples

### Add New Employee

**Request:**

```json
POST /employees
{
  "firstName": "John",
  "lastName": "Doe"
}
```

**Response (201 Created):**

```json
{
  "id": "1",
  "firstName": "John",
  "lastName": "Doe"
}
```

### Get All Employees

**Request:**

```bash
GET /employees
```

**Response (200 OK):**

```json
[
  {
    "id": "1",
    "firstName": "John",
    "lastName": "Doe"
  }
]
```

## Project Structure

```
springboot-swagger-jwt/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/hendisantika/
│   │   │       ├── config/
│   │   │       │   └── SwaggerConfiguration.java
│   │   │       ├── controller/
│   │   │       │   ├── EmployeeController.java
│   │   │       │   └── ClientsRestController.java
│   │   │       ├── exception/
│   │   │       │   └── AuthenticationException.java
│   │   │       ├── model/
│   │   │       │   ├── Employee.java
│   │   │       │   └── EmployeeRequest.java
│   │   │       ├── service/
│   │   │       │   ├── AuthenticationService.java
│   │   │       │   ├── AuthenticationServiceImpl.java
│   │   │       │   ├── EmployeeService.java
│   │   │       │   └── EmployeeServiceImpl.java
│   │   │       └── SpringbootSwaggerJwtApplication.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
├── pom.xml
└── README.md
```

## Configuration

The application can be configured via `src/main/resources/application.yml`:

```yaml
springdoc:
  swagger-ui:
    path: /swagger-ui
    display-request-duration: true
    groups-order: DESC
    operationsSorter: method
    use-root-path: true
  api-docs:
    path: /v3/api-docs
  show-actuator: true

openapi:
  title: Open API Demo
  version: v1.0.0
  description: Swagger UI using Open API Specification
```

## Testing the API

### Using Swagger UI:

1. Navigate to http://localhost:8080/swagger-ui/index.html
2. Select an endpoint
3. Click "Try it out"
4. Fill in the required parameters
5. For protected endpoints, click "Authorize" and enter your JWT token
6. Click "Execute"

### Using cURL:

```bash
# Get all employees
curl http://localhost:8080/employees

# Get employee by ID
curl http://localhost:8080/employees/1

# Add new employee (requires JWT)
curl -X POST http://localhost:8080/employees \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer <your-token>" \
  -d '{"firstName":"Jane","lastName":"Smith"}'
```

## Development

### Running Tests:

```bash
mvn test
```

### Build without tests:

```bash
mvn clean install -DskipTests
```

### Package the application:

```bash
mvn package
```

## Security Features

- JWT Bearer token authentication
- Authorization header validation
- Custom authentication exception handling
- Secure endpoint protection for create, update, and delete operations
- Public access for read-only operations

## Response Codes

| Status Code | Description                                         |
|-------------|-----------------------------------------------------|
| 200         | Success - Request completed successfully            |
| 201         | Created - New resource created successfully         |
| 400         | Bad Request - Invalid request parameters            |
| 401         | Unauthorized - Authentication required or failed    |
| 404         | Not Found - Resource not found                      |
| 500         | Internal Server Error - Server encountered an error |

## Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](http://www.apache.org/licenses/LICENSE-2.0)
file for details.

## Author

**Hendi Santika**

- Email: hendisantika@yahoo.co.id
- GitHub: [@hendisantika](https://github.com/hendisantika)
- Telegram: @hendisantika34
- Links: [linktr.ee/hendisantika](https://linktr.ee/hendisantika)

## Acknowledgments

- Spring Boot team for the excellent framework
- SpringDoc team for the OpenAPI integration
- Moshi team for the JSON library

## Support

If you find this project helpful, please give it a ⭐️!

For issues, questions, or suggestions, please open an issue on GitHub.

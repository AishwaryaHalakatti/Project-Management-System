# Project-Management-System
This project is a simple Project Management System developed using Java 17 and Spring Boot. It implements CRUD (Create, Read, Update, Delete) operations for managing projects via a RESTful API.

## Features

- Create, retrieve, update, and delete projects.
- Utilizes an in-memory H2 database for data storage and management.
- Implements global exception handling and validation for input data.
- Provides API documentation using Swagger.

- ## Setup Instructions

1. **Clone the Repository:**

   ```bash
   git clone <repository_url>

# Navigate to the Project Directory:
    cd project-directory

# Build and Run the Project:
    Using Maven:mvn spring-boot:run
# Access Swagger UI:
    http://localhost:8080/swagger-ui/index.html

# API Usage
Endpoints
POST /projects: Create a new project.
GET /projects/{id}: Retrieve a project by ID.
GET /projects: Retrieve all projects.
PUT /projects/{id}: Update an existing project.
DELETE /projects/{id}: Delete a project by ID.

# License
This project is licensed under the MIT License.




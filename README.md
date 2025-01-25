# Book Social Network (BSN)  

**Book Social Network (BSN)** is a platform designed to bring together book enthusiasts for sharing and exchanging books. With BSN, users can manage their book collections and engage with a vibrant community of like-minded individuals.  

## Overview  
BSN is a full-stack application built with modern technologies to ensure scalability, security, and usability.  
The platform enables users to:  
- Register and validate accounts through secure email validation.  
- Manage book collections with features like creating, updating, sharing, and archiving books.  
- Borrow and return books with proper availability checks and approval processes.  

The backend is powered by **Spring Boot 3** and **Spring Security 6**, while the frontend is developed using **Angular** with **Bootstrap** for styling.  

## Features  

### Core Functionalities  
- **User Registration**: Create new accounts with a seamless registration process.  
- **Email Validation**: Secure account activation via email validation codes.  
- **User Authentication**: Login securely with JWT token-based authentication.  
- **Book Management**:  
  - Create, update, share, and archive books.  
  - Track and manage personal book collections.  
- **Book Borrowing**:  
  - Determine if a book is available for borrowing.  
  - Borrow books from other members of the network.  
- **Book Returning**:  
  - Return borrowed books easily.  
  - Include an approval process for returns.

 ![spring-security](https://github.com/user-attachments/assets/f2794833-0171-4511-8c56-92808f7f2bbf)

    
### Backend Features (book-network)  
- **Technologies & Tools**:  
  - Spring Boot 3 for backend development.  
  - Spring Security 6 for robust authentication and authorization.  
  - JWT Token Authentication for secure user sessions.  
  - Spring Data JPA for database interactions.  
  - JSR-303 and Spring Validation for input validation.  
  - OpenAPI and Swagger UI for API documentation.  
  - Docker for containerized deployment.  
  - GitHub Actions for CI/CD pipeline automation.  
  - Keycloak for advanced authentication and role management.
 
    ![backend-pipeline](https://github.com/user-attachments/assets/69985d9d-5ac6-4fbc-836e-cec5cf5e16d6)


### Frontend Features (book-network-ui)  
- **Technologies & Tools**:  
  - Angular with a component-based architecture.  
  - Lazy loading for optimized performance.  
  - Authentication Guard for protecting routes.  
  - OpenAPI Generator for Angular to ensure API type-safety.  
  - Bootstrap for responsive and modern styling.
 
    ![frontend-pipeline](https://github.com/user-attachments/assets/bb045f02-2ee4-42c5-9e6d-7bf3dc2c9be0)


## Getting Started  

### Prerequisites  
1. **Java Development Kit (JDK 17+)**  
2. **Node.js (v16+) and npm**  
3. **Docker**  
4. **Angular CLI**  

### Backend Setup  
1. Clone the repository:  
   ```bash  
   git clone https://github.com/your-username/book-network.git  
   cd book-network  
   ```  
2. Build the project:  
   ```bash  
   ./mvnw clean install  
   ```  
3. Run the application:  
   ```bash  
   ./mvnw spring-boot:run  
   ```  

### Frontend Setup  
1. Clone the frontend repository:  
   ```bash  
   git clone https://github.com/your-username/book-network-ui.git  
   cd book-network-ui  
   ```  
2. Install dependencies:  
   ```bash  
   npm install  
   ```  
3. Run the application:  
   ```bash  
   ng serve  
   ```  
4. Access the application at `http://localhost:4200`.  

## API Documentation  
The backend API documentation is available via Swagger UI. Once the backend is running, you can access it at:  
```
http://localhost:8080/swagger-ui.html  
```

## Contributing  
Contributions are welcome! Please fork the repository and submit a pull request with your changes.  


---

## License  
This project is licensed under the **Apache License 2.0**. See the [LICENSE](LICENSE) file for details.  

---  



# College Management System

## Description
The **College Management System** is a Spring Boot application designed to manage various aspects of a college, including students, professors, subjects, and admission records. It leverages **Spring Data JPA** for database management and supports RESTful APIs for CRUD operations.

## Features
- **Student Management**: Add, update, delete, and retrieve student records.
- **Professor Management**: Manage professor details and assignments.
- **Subject Handling**: Associate subjects with students and professors.
- **Admission Records**: Track and manage student admissions.
- **Database Integration**: Uses **MySQL** as the database.

## Tech Stack
- **Backend**: Spring Boot, Spring Data JPA
- **Database**: MySQL
- **Build Tool**: Maven
- **IDE**: IntelliJ IDEA
- **Version Control**: GitHub

## Project Structure
```
College_Management_System/
│── src/
│   ├── main/java/com/example/college/
│   │   ├── entity/        # Entity classes
│   │   ├── repository/    # Repository interfaces
│   │   ├── service/       # Business logic layer
│   │   ├── controller/    # REST API controllers
│   ├── main/resources/
│   │   ├── application.properties  # Database configurations
│── pom.xml  # Maven dependencies
│── README.md  # Project documentation
```

## Installation & Setup
1. **Clone the repository:**
   ```sh
   git clone https://github.com/VaishnaviRSawant/College_Management_System.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd College_Management_System
   ```
3. **Configure the database in `application.properties`:**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/college_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
4. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/students` | GET | Get all students |
| `/students/{id}` | GET | Get a student by ID |
| `/students` | POST | Add a new student |
| `/students/{id}` | PUT | Update a student |
| `/students/{id}` | DELETE | Delete a student |

_(Similar endpoints exist for professors, subjects, and admissions)_

## Contributions
Feel free to contribute by creating issues or submitting pull requests!

## License
This project is **MIT Licensed**.

## Author
[Vaishnavi R Sawant](https://github.com/VaishnaviRSawant)


### Assignment: Magic Number Game with Spring Boot, Thymeleaf, and PostgreSQL

#### Overview

In this assignment, you will develop a "Magic Number Game" using an existing Spring Boot project configured with Thymeleaf, Spring Data JPA, and PostgreSQL. The game involves generating a random number that players attempt to guess. Each game session, along with the player's guesses, will be stored in a PostgreSQL database. The application will provide a web interface using Thymeleaf for users to start a new game, make guesses, and view the results.

#### Objectives

1. **Understand the Project Setup**: Familiarize yourself with the provided project structure and dependencies.
2. **Configure PostgreSQL**: Set up and configure a PostgreSQL database for the application.
3. **Develop the Application**: Implement the game logic using the provided Spring Boot setup.
4. **Test the Application**: Ensure the application works as expected by manually testing its functionality through the web interface.

#### Requirements

- **Java Development Kit (JDK)**: Version 11 or above.
- **IDE**: Any Java IDE such as IntelliJ IDEA, Eclipse, or VS Code.
- **PostgreSQL**: Setup locally or use a cloud-based instance.
- **GitHub Classroom**: Access to GitHub Classroom for assignment submission.

#### Instructions

##### Step 1: Familiarize with the Project

1. **Clone the Repository**: Start by cloning the repository provided in GitHub Classroom which contains the initial `pom.xml` and project structure.
2. **Explore the Dependencies**: Ensure you understand the dependencies included in the `pom.xml`. The project is already set up with Spring Web, Spring Data JPA, Thymeleaf, and PostgreSQL Driver.

##### Step 2: Configure PostgreSQL

1. **Database Setup**: Install PostgreSQL if not already installed and create a new database named `magicnumbergame`.
2. **Application Properties**: Configure the `application.properties` file with the database connection details and any other necessary configurations.

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/magicnumbergame
   spring.datasource.username=postgres
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

##### Step 3: Develop the Application

1. **Model Creation**:
   - Create a `GameSession` entity with attributes for `id`, `magicNumber`, and `isActive`.

2. **Repository**:
   - Develop a `GameSessionRepository` that extends `JpaRepository`.

3. **Service Layer**:
   - Implement a `GameService` that handles the logic for starting a new game, making a guess, and checking the game status.

4. **Controller**:
   - Create a `GameController` with methods to handle web requests and interact with the game service. Use Thymeleaf templates to render the views.

5. **Thymeleaf Templates**:
   - Create Thymeleaf templates for the game interface, including pages for starting a game, making guesses, and displaying results.

##### Step 4: Testing the Application

1. **Manual Testing**: Manually test the application by interacting with the Thymeleaf web interface to ensure that all functionalities work as expected.
2. **Database Validation**: Check that the game sessions and guesses are correctly stored and updated in the PostgreSQL database.

#### Deliverables

- Source code committed to the GitHub Classroom repository.
- A README file documenting how to set up and run the application.
- Screenshots or a brief video demonstrating the functionality of the application.

#### Evaluation Criteria

- Functionality: The application meets all the functional requirements.
- Code Quality: The code is clean, well-organized, and properly commented.
- Error Handling: The application gracefully handles and reports errors.
- Documentation: The code and application are well-documented.

#### Submission

Submit the assignment through GitHub Classroom. Ensure that all your final changes are pushed to your repository before the deadline.

### Conclusion

This assignment will enhance your skills in developing web applications using Spring Boot, integrating with a relational database using Spring Data JPA, and creating interactive user interfaces with Thymeleaf. This practical experience is essential for developing robust and user-friendly web applications.
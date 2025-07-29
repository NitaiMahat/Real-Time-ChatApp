
# Real-Time Chat App

A real-time chat application built with **Spring Boot**, **WebSocket**, and **MySQL**. Users can register and exchange instant messages in their browser. Communication is powered by STOMP over WebSocket for a seamless, modern chat experience.

## Extending the App

Working on the following:

- Add user authentication/session management (Spring Security)
- Support private messages and chat rooms
- Store chat message history in the database
- Display online user status
- Enable image/file sharing in chat

  
## Features

- **Real-Time Messaging:** Instant message delivery using WebSocket and STOMP.
- **Multi-User Support:** Multiple clients can connect and participate simultaneously.
- **Modern Frontend:** Responsive, Bootstrap-powered chat UI.
- **Persistence:** User data stored securely in MySQL using Spring Data JPA.

## Technologies Used

- Java 17+
- Spring Boot (Web, WebSocket, Data JPA, Thymeleaf)
- Spring Security (for password hashing)
- MySQL
- Maven
- Bootstrap, SockJS, STOMP.js (frontend)

## Key Classes and Configuration

- **SecurityConfig:** BCrypt-based password hashing.
- **WebSocketConfig:** Configures WebSocket/STOMP endpoint `/chat`, restricts origins, and registers message topics.
- **AuthController:** REST API endpoints for user registration.
- **ChatController:** Handles broadcasting chat messages via `/topic/messages`.
- **User/ChatMessage:** JPA entities for users and chat messages.
- **UserService:** Handles registration logic and password encryption.



## Prerequisites

- Java 17 or higher
- Maven
- MySQL running and accessible

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/NitaiMahat/Real-Time-ChatApp.git
    cd Real-Time-ChatApp
    ```

2. **Configure Database:**

    Edit `src/main/resources/application.properties`:

    ```
    spring.datasource.url=jdbc:mysql://localhost:3306/chatapp
    spring.datasource.username=YOUR_USERNAME
    spring.datasource.password=YOUR_PASSWORD
    ```

    Make sure the database `chatapp` exists.

3. **Build and Run:**

    ```bash
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```

4. **Access the Chat:**

    Open [http://localhost:8080/chat](http://localhost:8080/chat) in your browser.

## User Registration

Register via the REST API:

```
POST http://localhost:8080/auth/register
Content-Type: application/json

{
  "email": "user@example.com",
  "password": "yourPassword",
  "firstName": "John",
  "lastName": "Doe"
}
```


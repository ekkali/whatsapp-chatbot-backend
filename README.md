# WhatsApp Chatbot Backend Simulation

A simple RESTful API built with Java and Spring Boot to simulate a WhatsApp chatbot backend. This project was built to fulfill an assignment task requiring a webhook endpoint that processes simulated WhatsApp JSON messages, returns predefined replies, and logs incoming traffic.

## 🚀 Features

* **REST API Endpoint:** Exposes a `/webhook` endpoint to accept POST requests.
* **JSON Processing:** Parses incoming JSON payloads mimicking WhatsApp message formats.
* **Predefined Routing:** Automatically responds to specific keywords (`Hi` &rarr; `Hello`, `Bye` &rarr; `Goodbye`).
* **Request Logging:** Utilizes SLF4J to log the sender ID and message text of all incoming requests to the console.
* **Cloud Deployment:** Deployed live on Render (Bonus Task).

## 🛠️ Tech Stack

* **Language:** Java 17
* **Framework:** Spring Boot 3.2.x
* **Dependencies:** Spring Web
* **Build Tool:** Maven

## 💻 Local Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/yourusername/whatsapp-chatbot-backend.git](https://github.com/yourusername/whatsapp-chatbot-backend.git)
   cd whatsapp-chatbot-backend
Build the project using Maven:

Bash
./mvnw clean install
Run the Spring Boot application:

Bash
./mvnw spring-boot:run
The server will start on http://localhost:8080.

📡 API Documentation
POST /webhook
Simulates receiving a message from a WhatsApp user.

Request Header:
Content-Type: application/json

Request Body:

JSON
{
  "sender": "919876543210",
  "text": "Hi"
}
Success Response (200 OK):

JSON
{
  "reply": "Hello"
}
☁️ Cloud Deployment (Live Demo)
This API is actively deployed on Render. You can test the live endpoint by sending a POST request to:
URL:  https://whatsapp-chatbot-backend-7va7.onrender.com


   

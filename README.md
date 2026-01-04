# Spring Cloud Microservices Demo

This repository contains a **demo project** showcasing a microservices-based application.  
It is designed to provide a hands-on understanding of **microservices architecture and implementation**.  

The project consists of:  
- **API Gateway**  
- **Config Server**  
- **Discovery Server**  
- Two microservices: **Student** and **College**

---

## Project Components

### API Gateway
The API Gateway serves as the **single entry point** for all client requests, managing and routing them to the appropriate microservices.

### Config Server
The Config Server centralizes **configuration management** for all microservices, simplifying application maintenance and ensuring consistency across environments.

### Discovery Server
The Discovery Server provides **service registration and discovery**, enabling seamless service-to-service communication within the microservices ecosystem.

### Student Microservice
The Student Microservice manages **student-related data and operations**, including adding, updating, and retrieving student records.

### Collage Microservice
The Collage Microservice manages **collage-related data and operations**, including adding, updating, and retrieving collage records.

### Inter-Service Communication Using OpenFeign
This project demonstrates **inter-service communication** using OpenFeign, a declarative REST client that simplifies communication between microservices.

---

## Technologies Used
- Java 17  
- Spring Boot  
- Spring Cloud (Config Server, Eureka Discovery, Gateway, OpenFeign)  
- MySQL  
- Maven  

---

## How to Run
1. Start the **Config Server**  
2. Start the **Discovery Server (Eureka)**  
3. Start the **API Gateway**  
4. Start the **Student Microservice** and **Collage Microservice**  
5. Use API Gateway routes to access the microservices endpoints  

---


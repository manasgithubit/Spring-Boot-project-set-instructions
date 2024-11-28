Overview
---------
#Project Name - Users and Patients or Heart rate details:
--------------------------------------------------------
Spring Boot application designed for monitoring patient heart rate data in a healthcare environment. 
The system allows healthcare providers to track and manage patient heart rate information, store data securely, and view relevant details through a RESTful API.

#Technology Stack:
------------------
 . java: 17 
 . Backend: Spring Boot (Java) 
 . Database: MySQL(Depending on the stack) 
 . Validation: Hibernate Validator (for Spring Boot) 
 . Build Tool: Maven 
 . Version Control: Git (hosted on GitHub) 
 . Deployment: optional for deployment phase

#Project Description:
---------------------
Spring Boot application provides a RESTful API to manage patients and their heart rate details.
The application includes the following core features:-
. User management (create, update, delete, and view users).
. Patient management (add new patients, update patient records).
. Heart rate monitoring (store and retrieve heart rate data for patients).

#Setup Instructions:
-------------------
To run this Spring Boot application locally i am using Maven.

#Using Maven:
-------------
Build the project using Maven:
            - mvn clean install
            
#Run the application:
---------------------
mvn spring-boot:run

#API Endpoint
-------------
The spring boot application of main RESTful API endpoints available in the application:-
1. User Endpoints
   . Create a new user:
        Request Body and Response:
        localhost:8080/users/register
        localhost:8080/users/login
   JSON
   {
       "email":manas@838,
       "password":"kddj223"
   }
2. Patient Endpoints:
   . Create a new patient
        Request Body:
   JSON
   {
      "name":"manas",
      "age":47
   }
3. Heart Rate Endpoints:
    . Record heart rate for a patient:
      Request Body:
   JSON
   {
      "Hname":"manas",
      "Hid":209
   }

Assumptions:
------------
. The database used is an in-memory database (e.g., H2) for simplicity. In a production environment, you may use a relational database like MySQL.
. Time zone information is not considered in the heart rate data and timestamps; consider adding proper time zone handling in future versions.

#Database Schema:
----------------
The spring boot application uses the database schema for storing user, patient, and heart rate data.

#Push to GitHub
---------------
Clean commit messages: Use clear and concise commit messages.
. Added API for managing users
. Implemented patient management functionality
. Setup H2 database for heart rate data.

#GitHub Link
------------
https://github.com/manasgithubit.



   











### View all of my Projectworks - click over here -> [Vivek Vellaiyappan Project Works](https://github.com/vivekVells/VivekVellaiyappanProjectWorks)

# SpringBootApplnTryout
- Learn about Spring boot application

### Objective
- understand how Spring Boot works and how to create production grade website

### Project Working Demo
- [Video Link]() - to be updated
- [Working Demo - GIF]() - to be updated
- [Working Demo Files](https://github.com/vivekVells/SpringBootApplnTryout/tree/master/Demo)
- [Working Demo - PDF]() - to be updated 

### Tech involved
- Spring Boot, Spring MVC, Spring REST controller, Apache Derby, Tomcat Server, Postman, jUnit, Swagger, Thymeleaf, Bootstrap, jQuery, HTML, CSS, JavaScript

### Instructions to run (will update in detail later)
- Make sure Java v8 and Maven is available
- Clone or download this repo
- goto ..\SpringBootApplnTryout\Code where pom.xml is present
- do ```mvn clean package```
- run this command ```java -jar target\course-api-springboot-appln-1.0-SNAPSHOT.war```
- By default, this application port is mapped to 8080 port which can be configured in application.properties file under resources
- goto the following urls to verify its working process (Post arg to be done for this course/{id} - use postman in that case)
  - http://localhost:8080/ 
  - http://localhost:8080/courses 
  - http://localhost:8080/course/{id}

## App Working Functionality Previews
### Preview 
#### http://localhost:8080/ 
![](https://github.com/vivekVells/SpringBootApplnTryout/blob/master/Demo/welcome-screen-springboot-appln.PNG)
#### http://localhost:8080/courses 
![](https://github.com/vivekVells/SpringBootApplnTryout/blob/master/Demo/courses-mapped-response.PNG)

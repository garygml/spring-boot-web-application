# spring-boot-web-application
my spring boot web application
in progress 

The app uses JPA in collaboration with Hibernate to connect to my local MySQL database with 
```
 user: root
 password: password
```
Change with your connection information in `/src/main/resources/application.properties`

User passwords are encrypted with BCrypt in the database. 

Use the following script if packaging to jar
```
mvn clean package
java -jar (the-name-of-the-jar-generated-from-the-previous-command)
```

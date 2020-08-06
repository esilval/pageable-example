# Pageable example

Description
-----
This example was made with the purpose of teach how to use the `Pageable` interface, in order to manage paginated queries.

This project contains:
* A `spring-boot` project with JPA entity and a controller that performs the query
* A lightweight database connection by using a **H2** database.

Install tools
-----
- Java 8
- Maven 3.6
- IntelliJ - Eclipse

Setup
-----
- Clone and open in Intellij Idea IDE or Eclipse
- Install maven dependencies using IDE auto import or using the command ``mvn install``
- Run the app using ``mvn spring-boot:run``
- Create package for deployment using ``mvn package`` (change properties if required)

Run as
-----

>>>
>`curl --location --request GET 'http://localhost:9090/api/v1/myapp/person/search?size=10&page=1'`
>>>
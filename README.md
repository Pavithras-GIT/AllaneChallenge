Leasing Application
==========================

Leasing application implemented to be able to administrate leasing contracts. 

*Tech Stack*
Spring Boot - 2.7.11
Java 11
Spring Data JPA
Gradle
MySQL Database


# How to run it?

There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the LeasingApplication.java class from your IDE.

If you have gradle installed and under linux/mac:

    gradle runJar

If gradle is not installed, but still under linux/mac

    gradlew runJar

And for windows without gradle

    gradlew.bat runJar

After the server is running, go to

```
http://localhost:8080/

```

EndPoints are available below:

Create-Customer	POST	customers/create-customer
update-customer	PUT		customers/edit-customer/{customerid}
Create Vehicle	POST	vehicles/create-vehicle
update-vehicle	PUT		vehicles/update-vehicle
view Summary	GET		leasing/view-contracts-summary
create contract	POST	leasing/ create-contract




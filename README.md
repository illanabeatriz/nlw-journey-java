<h1 align="center" style="font-weight: bold;">Plann.er 📅</h1>

<p align="center">
 <a href="#technologies">Technologies</a> •
 <a href="#prerequisites">Prerequisites</a> •
 <a href="#about">About</a>
</p>

<p align="center">
    <b>Application created during the 16th edition of NLW Journey on the Java path.</b>
</p>

<h2 id="technologies">🛠️ Technologies</h2>

- Java

<h2 id="prerequisites">📋 Prerequisites</h2>

- Maven 3.9
- Java 21
- Your preferred IDE (Eclipse, IntelliJ IDEA, VS Code or another one).
- Tool for API testing (optional).

<h2 id="about">💻 About</h2>

Plann.er is the simplified version of a responsive travel itinerary application, and was proposed as the main project of the 16th edition of Next Level Week Journey (promoted by [Rocketseat](https://app.rocketseat.com.br/)).

This repository presents the result obtained through the Java path.

The project was generated with [Spring Initializr](https://start.spring.io/) (a quickstart generator for Spring Boot projects) with the following dependencies:

- Spring Web
- Flyway Migration
- Spring Boot DevTools
- Lombok
- Spring Data JPA
- H2 Database

The previously generated project was then opened on [IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html) (an Integrated Development Environment (IDE) for Java and Kotlin), where the code was written and simultaneously tested with [Insomnia](https://insomnia.rest/).

The database created for this project allows:

- Create, confirm and update a trip;
- Invite and confirm a participant;
- Register activities of a trip.

It is also possible to retrieve trip information, such as: details, participants, activities and trip links.
package com.example.socset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
spring.datasource.url=jdbc:postgresql://127.0.0.1:5432/mydb
spring.datasource.username=postgres
spring.datasource.password=1
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=validate
spring.profiles.active=development
jwt.secret=simple
spring.main.allow-circular-references=true
 */


/*
spring.datasource.url=jdbc:postgresql://localhost:5432/popytka101
spring.datasource.username=postgres
spring.datasource.password=1
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=validate
spring.profiles.active=development
spring.flyway.baseline-on-migrate=true
spring.flyway.validate-on-migrate=false
jwt.secret=simple
 */

/*
create table users
(
    id       integer not null
        constraint user_id
            primary key,
    username text    not null,
    email    text    not null,
    password text    not null
);
 */
@SpringBootApplication
public class SocsetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocsetApplication.class, args);
	}

}

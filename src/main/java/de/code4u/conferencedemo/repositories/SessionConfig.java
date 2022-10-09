package de.code4u.conferencedemo.repositories;

import de.code4u.conferencedemo.models.Session;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SessionConfig {
    @Bean
    CommandLineRunner initSessions(SessionRepository repository){
        return args -> {
            repository.save(new Session("Liebling, es ist aus.", "Halber Mensch", 12));
        };
    }
}

package fr.m2i.m2ws;


import fr.m2i.m2ws.Notation.CRUDNotation;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    @PostConstruct
    private void postConstruct() {
        System.out.println("Hello :) ");
        CRUDNotation.connection();
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("Bye :) ");
        CRUDNotation.disconnection();
    }
}
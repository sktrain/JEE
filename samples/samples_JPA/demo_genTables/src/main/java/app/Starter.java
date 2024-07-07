package app;

import jakarta.persistence.Persistence;

public class Starter {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("persistenceUnit");
    }
}

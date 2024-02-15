// package com.bezkoder.spring.datajpa;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class SpringBootDataJpaApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(SpringBootDataJpaApplication.class, args);
// 	}

// }
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataJpaApplication.class, args);

        // Ajouter un thread en attente
        Thread awaitThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(Long.MAX_VALUE);
                } catch (InterruptedException e) {
                    // Traitement de l'interruption
                }
            }
        });
        awaitThread.start();
    }
}

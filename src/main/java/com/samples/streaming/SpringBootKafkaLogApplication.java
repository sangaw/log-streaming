package com.samples.streaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringBootKafkaLogApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringBootKafkaLogApplication.class, args);
        Timer timer = new Timer();
        timer.log();
    }

    public void performTasks() {
        SpringApplication.run(SpringBootKafkaLogApplication.class);
        Timer timer = new Timer();
        try {
            timer.log();
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
    }
}
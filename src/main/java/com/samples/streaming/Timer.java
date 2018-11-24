package com.samples.streaming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timer {

    private static Logger logger = LogManager.getLogger();

    public void log() throws InterruptedException {
        while(true) {
            //logger.info("Inside scheduleTask - Sending logs to Kafka at " + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
            logger.info("{\"datetime\" : \"25 Nov 2018 7:25 AM\",\"usecaseid\":\"FC001\",\"activity\":\"file-receive\", \"communication-mode\" : \"product-master-data-file-inbound\",  \"event-code\" : \"product-master-data-custom-formater-start\", \"event-desc\" : \"Payload received as A file from TUI\"}");
            Thread.sleep(3000);
        }
    }

}

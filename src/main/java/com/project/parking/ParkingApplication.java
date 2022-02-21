package com.project.parking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(ParkingApplication.class);

  public static void main(String[] args) {
    LOGGER.info("Starting Spring Boot Application . . .");
    SpringApplication.run(ParkingApplication.class, args);
  }

}

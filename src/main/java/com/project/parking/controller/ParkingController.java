package com.project.parking.controller;

import com.project.parking.entity.ParkingTicket;
import com.project.parking.service.ParkingService;
import com.project.parking.service.ParkingServiceImpl;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking-app/api")
@Api(value = "Parking garage app", tags = {"REST API for Parking Garage"})
public class ParkingController {

  private final ParkingService parkingService;

  public ParkingController(ParkingService parkingService) {
    this.parkingService = parkingService;
  }

  private static final Logger LOGGER = LoggerFactory.getLogger(ParkingController.class);



  @PostMapping("/v1/parking-ticket/new")
  public int addParkingTicket() {
    LOGGER.info("ParkingController.addParkingTicket() start");
    int parkingTicket = this.parkingService.addParkingTicket();
    LOGGER.info("ParkingController.addParkingTicket() end");
    return parkingTicket;
  }

  // entering garage
  // get ticket
  // id
  // timestamp

  // exiting garage
  // scan id
  // find your id in db
  // get timestamp
  // subtract the timestamp from current time
  // calculate cost of parking
}

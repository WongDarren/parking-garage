package com.project.parking.controller;

import com.project.parking.entity.ParkingTicket;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking/api")
@Api(value = "Parking garage app", tags = {"REST API for Parking Garage"})
public class ParkingController {

  @GetMapping("/v1/createParkingTicket")
  public ParkingTicket createParkingTicket() {

    ParkingTicket parkingTicket = null;

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

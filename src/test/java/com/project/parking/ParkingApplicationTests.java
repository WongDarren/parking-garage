package com.project.parking;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.project.parking.controller.ParkingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParkingApplicationTests {

  @Autowired
  private ParkingController parkingController;

  @Test
  void contextLoads() {
    assertNotNull(this.parkingController);
  }

}

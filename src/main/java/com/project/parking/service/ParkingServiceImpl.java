package com.project.parking.service;

import com.project.parking.dao.ParkingDao;
import com.project.parking.entity.ParkingTicket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParkingServiceImpl implements ParkingService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ParkingServiceImpl.class);

  private final ParkingDao parkingDao;

  public ParkingServiceImpl(ParkingDao parkingDao) {
    this.parkingDao = parkingDao;
  }

  @Override
  public ParkingTicket createParkingTicket() {
    LOGGER.info("ParkingService.createParkingTicket() start");

    ParkingTicket parkingTicket = this.parkingDao.createParkingTicket();

    LOGGER.info("ParkingService.createParkingTicket() end");

    return parkingTicket;
  }

}

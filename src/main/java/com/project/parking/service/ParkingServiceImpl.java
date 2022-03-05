package com.project.parking.service;

import com.project.parking.dao.ParkingDao;
import com.project.parking.entity.ParkingTicket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ParkingServiceImpl implements ParkingService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ParkingServiceImpl.class);

  private final ParkingDao parkingDao;

  public ParkingServiceImpl(ParkingDao parkingDao) {
    this.parkingDao = parkingDao;
  }

  @Override
  public int addParkingTicket() {
    LOGGER.info("ParkingService.addParkingTicket() start");

    int parkingTicket = this.parkingDao.addParkingTicket();

    LOGGER.info("ParkingService.addParkingTicket() end");

    return parkingTicket;
  }

}

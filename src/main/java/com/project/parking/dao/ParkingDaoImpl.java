package com.project.parking.dao;

import com.project.parking.entity.ParkingTicket;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ParkingDaoImpl implements ParkingDao {

  private static final Logger LOGGER = LoggerFactory.getLogger(ParkingDaoImpl.class);

  private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  public static final String ADD_PARKING_TICKET = "INSERT INTO PARKING_TICKETS( "
      + " TICKET_ID "
      + " , DATE_CREATED "
      + " ) "
      + " VALUES( "
      + " :ticketId "
      + " , :dateCreated "
      + " ) ";

  public ParkingDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
    this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
  }

  @Override
  public int addParkingTicket() {
    LOGGER.info("ParkingDao.addParkingTicket() start");
    MapSqlParameterSource namedParameter = new MapSqlParameterSource("ticketId", "abcd123456")
        .addValue("dateCreated", LocalDateTime.now());
    int createdTicket = this.namedParameterJdbcTemplate.update(ADD_PARKING_TICKET, namedParameter);
    LOGGER.info("ParkingDao.addParkingTicket() end");
    return createdTicket;
  }

}

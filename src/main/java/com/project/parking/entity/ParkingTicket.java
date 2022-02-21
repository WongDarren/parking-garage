package com.project.parking.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ParkingTicket {

  @ApiModelProperty(notes = "Parking Ticket ID")
  private String parkingId;
  @ApiModelProperty(notes = "Parking Ticket Time")
  private LocalDateTime parkingTime;

}

package com.finalproject.VeterinarianClinic.Entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class AppointmentServices {
  
  private int appointmentId;    
  private int serviceId; 

}

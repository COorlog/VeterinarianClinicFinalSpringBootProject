package com.finalproject.VeterinarianClinic.Entities;


import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Appointments {
  
  private int id;    
  private int petId; 
  private String scheduledAppt;  
  

}

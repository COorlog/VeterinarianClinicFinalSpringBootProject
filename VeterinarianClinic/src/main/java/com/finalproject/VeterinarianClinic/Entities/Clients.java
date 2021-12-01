package com.finalproject.VeterinarianClinic.Entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Clients {
  
  private int Id;    
  private String firstName;   
  private String lastName; 
  private String mailingAddress;  
  private  String City;   
  private String State; 
  private int zipCode;   
  private String Phone;
  private String Email;

}

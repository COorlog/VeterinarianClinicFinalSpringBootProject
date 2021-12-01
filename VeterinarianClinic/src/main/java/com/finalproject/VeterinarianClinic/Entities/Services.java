package com.finalproject.VeterinarianClinic.Entities;

import lombok.Builder;
import lombok.Data;

 
  @Data
  @Builder
  
  public class Services {
    
    private int id;    
    private int petId;   
    private String apptType; 
    private String description;  
    
    
    }




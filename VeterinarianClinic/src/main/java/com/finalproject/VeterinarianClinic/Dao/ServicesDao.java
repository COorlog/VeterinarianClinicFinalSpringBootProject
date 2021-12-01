package com.finalproject.VeterinarianClinic.Dao;

import java.util.List;
import com.finalproject.VeterinarianClinic.Entities.Services;

public interface ServicesDao {
  
  List<Services> getServices();
  
  Services postServices(Services services);
  
  Services updateServices(Services services);
  
  Services deleteServices(Services services);


}

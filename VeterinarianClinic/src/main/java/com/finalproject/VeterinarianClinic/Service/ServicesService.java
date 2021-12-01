package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import com.finalproject.VeterinarianClinic.Entities.Services;

public interface ServicesService {

  List<Services> getServices();

  Services postServices(Services services);

  Services updateServices(Services services);

  Services deleteServices(Services services);

}
